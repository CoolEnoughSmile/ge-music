package ces.ge.music.controller;

import ces.ge.music.entity.User;
import ces.ge.music.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@Controller
@RequestMapping("user")
@Api(value = "user", description = "用户基础功能")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("login")
    @ApiOperation(value = "用户登录", httpMethod = "POST", notes = "用户登录")
    public String login(@RequestParam String phone){
        User user = userService.selectUserByPhone(phone);
        System.out.println(user);
        return "hello："+ user.getNickName();
    }
}
