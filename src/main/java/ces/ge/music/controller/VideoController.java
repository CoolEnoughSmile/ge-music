package ces.ge.music.controller;

import ces.ge.music.entity.Video;
import ces.ge.music.service.VideoService;
import ces.ge.music.utils.ResponseHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("video")
@Api(value = "video", description = "视频相关")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @ResponseBody
    @GetMapping("getVideoList")
    @ApiOperation(value = "获取视频列表", httpMethod = "GET", notes = "获取视频列表")
    public ResponseHelper<List<Video>> getVideoList(@RequestParam int pageNum, @RequestParam int pageSize){
        return videoService.getVideoList(pageNum,pageSize);
    }

}
