package ces.ge.music.mapper;

import ces.ge.music.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {

    User slectUserByPhone(String phone);

}
