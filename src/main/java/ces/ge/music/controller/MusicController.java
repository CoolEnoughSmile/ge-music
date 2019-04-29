package ces.ge.music.controller;

import ces.ge.music.entity.Music;
import ces.ge.music.service.MusicService;
import ces.ge.music.utils.ResponseHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("music")
@Api(value = "music", description = "音乐相关")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @ResponseBody
    @GetMapping("getMusicList")
    @ApiOperation(value = "获取音乐列表", httpMethod = "GET", notes = "获取音乐列表")
    public ResponseHelper<List<Music>> getMusicList(@RequestParam int pageNum, @RequestParam int pageSize){
        return musicService.getMusicList(pageNum,pageSize);
    }

}
