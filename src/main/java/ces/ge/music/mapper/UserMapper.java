package ces.ge.music.mapper;

import ces.ge.music.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {

    User queryUserByPhoneAndPassword(@Param("phone") String phone, @Param("password") String password);

    User queryUserByPhone(@Param("phone") String phone);

    int updatePasswordByPhone(@Param("phone") String phone, @Param("password") String password);

    int addNewUser(@Param("phone") String phone, @Param("password") String password,@Param("userId") String userId);

    User queryByPhone(@Param("phone") String phone);
}
