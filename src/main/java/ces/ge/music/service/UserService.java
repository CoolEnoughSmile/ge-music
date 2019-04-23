package ces.ge.music.service;

import ces.ge.music.entity.User;
import ces.ge.music.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUserByPhone(String phone){
       return userMapper.slectUserByPhone(phone);
    }
}
