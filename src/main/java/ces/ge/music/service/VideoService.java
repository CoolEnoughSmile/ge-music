package ces.ge.music.service;

import ces.ge.music.entity.Video;
import ces.ge.music.mapper.VideoMapper;
import ces.ge.music.utils.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class VideoService {

    @Autowired
    private VideoMapper videoMapper;

    public ResponseHelper<List<Video>> getVideoList(int pageNum, int pageSize){
        int from = (pageNum -1) * pageSize;
        List<Video> list = videoMapper.queryVideoList(from,pageSize);
        ResponseHelper<List<Video>> responseHelper = new ResponseHelper<>();
        if (list != null && !list.isEmpty()){
            responseHelper.success().setMessage("查询成功").setData(list);
        }else {
            responseHelper.fail().setMessage("无数据");
        }
        return responseHelper;
    }
}
