package ces.ge.music.mapper;

import ces.ge.music.entity.Music;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface MusicMapper {

    List<Music> queryMusicList(@Param("from") int from,@Param("to") int to);

}
