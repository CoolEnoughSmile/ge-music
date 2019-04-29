package ces.ge.music.service;

import ces.ge.music.entity.Music;
import ces.ge.music.mapper.MusicMapper;
import ces.ge.music.utils.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class MusicService {

    @Autowired
    private MusicMapper musicMapper;

    public ResponseHelper<List<Music>> getMusicList(int pageNum, int pageSize){
        int from = (pageNum -1) * pageSize;
        List<Music> list = musicMapper.queryMusicList(from,pageSize);
        ResponseHelper<List<Music>> responseHelper = new ResponseHelper<>();
        if (list != null && !list.isEmpty()){
            responseHelper.success().setMessage("查询成功").setData(list);
        }else {
            responseHelper.fail().setMessage("无数据");
        }
        return responseHelper;
    }

}
