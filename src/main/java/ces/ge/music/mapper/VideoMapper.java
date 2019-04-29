package ces.ge.music.mapper;

import ces.ge.music.entity.Video;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface VideoMapper {

    List<Video> queryVideoList(@Param("from") int from, @Param("to") int to);

}
