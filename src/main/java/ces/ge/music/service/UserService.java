package ces.ge.music.service;

import ces.ge.music.entity.User;
import ces.ge.music.mapper.UserMapper;
import ces.ge.music.utils.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.UUID;

@Transactional
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 手机号密码登录
     * @param phone
     * @param password
     * @return
     */
    public Map<String,Object> loginWithPhoneAndPassword(String phone,String password){
        User user = userMapper.queryUserByPhoneAndPassword(phone,password);
        Map<String,Object> map;
        if (user != null) {
            map = ResponseHelper.success("登录成功");
            map.put("user",user);
        }else {
            map = ResponseHelper.fail("用户名或密码错误");
        }
        return map;
    }

    /**
     * 验证码登录
     * @param phone
     * @return
     */
    public Map<String,Object> loginWithVCode(String phone){
        User user = userMapper.queryUserByPhone(phone);
        Map<String,Object> map;
        if (user !=null) {
            map = ResponseHelper.success("登录成功");
            map.put("user",user);
        }else {
            map = ResponseHelper.fail("该用户未注册");
        }
        return map;
    }

    /**
     * 修改密码
     * @param phone
     * @param password
     * @return
     */
    public Map<String,Object> resetPassword(String phone,String password){
        int result = userMapper.updatePasswordByPhone(phone,password);
        Map<String,Object> map;
        if (result > 0){
            map = ResponseHelper.success("密码修改成功");
        }else {
            map = ResponseHelper.fail("密码修改失败");
        }
        return map;
    }

    /**
     * 用户注册
     * @param phone
     * @param password
     * @return
     */
    public Map<String,Object> register(String phone,String password){
        User user = userMapper.queryByPhone(phone);
        Map<String, Object> map;
        if (user == null) {
            String userId = UUID.randomUUID().toString();
            int result = userMapper.addNewUser(phone, password,userId);
            if (result > 0) {
                map = ResponseHelper.success("注册成功");
            } else {
                map = ResponseHelper.fail("注册失败");
            }
        }else {
            map = ResponseHelper.fail("用户已存在");
        }
        return map;
    }

}