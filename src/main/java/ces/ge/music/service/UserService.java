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
    public  ResponseHelper<User> loginWithPhoneAndPassword(String phone,String password){
        User user = userMapper.queryUserByPhoneAndPassword(phone,password);
        ResponseHelper<User> responseHelper = new ResponseHelper<>();
        if (user != null) {
            responseHelper.success().setMessage("登录成功").setData(user);
        }else {
            responseHelper.fail().setMessage("用户名或密码错误");
        }
        return responseHelper;
    }

    /**
     * 验证码登录
     * @param phone
     * @return
     */
    public ResponseHelper<User> loginWithVCode(String phone){
        User user = userMapper.queryUserByPhone(phone);
        ResponseHelper<User> responseHelper = new ResponseHelper<>();
        if (user !=null) {
            responseHelper.success().setMessage("登录成功").setData(user);
        }else {
            responseHelper.fail().setMessage("用户名或密码错误");
        }
        return responseHelper;
    }

    /**
     * 修改密码
     * @param phone
     * @param password
     * @return
     */
    public ResponseHelper<User> resetPassword(String phone,String password){
        int result = userMapper.updatePasswordByPhone(phone,password);
        ResponseHelper<User> responseHelper = new ResponseHelper<>();
        if (result > 0){
            responseHelper.success().setMessage("密码修改成功");
        }else {
            responseHelper.fail().setMessage("密码修改失败");
        }
        return responseHelper;
    }

    /**
     * 用户注册
     * @param phone
     * @param password
     * @return
     */
    public ResponseHelper<User> register(String phone,String password){
        User user = userMapper.queryByPhone(phone);
        ResponseHelper<User> responseHelper = new ResponseHelper<>();
        if (user == null) {
            String userId = UUID.randomUUID().toString();
            int result = userMapper.addNewUser(phone, password,userId);
            if (result > 0) {
                responseHelper.success().setMessage("注册成功");
            } else {
                responseHelper.fail().setMessage("注册失败");
            }
        }else {
            responseHelper.fail().setMessage("用户已存在");
        }
        return responseHelper;
    }

}