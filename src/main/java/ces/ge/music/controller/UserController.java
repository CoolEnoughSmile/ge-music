package ces.ge.music.controller;

import ces.ge.music.entity.User;
import ces.ge.music.service.UserService;
import ces.ge.music.utils.ResponseHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
@Api(value = "user", description = "用户基础功能")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("loginWithPhoneAndPassword")
    @ApiOperation(value = "手机密码登录", httpMethod = "POST", notes = "手机密码登录")
    public ResponseHelper<User> loginWithPhoneAndPassword(@RequestParam String phone, @RequestParam String password){
        return userService.loginWithPhoneAndPassword(phone,password);
    }

    @ResponseBody
    @PostMapping("loginWithVCode")
    @ApiOperation(value = "手机短信验证码登录", httpMethod = "POST", notes = "手机短信验证码登录")
    public ResponseHelper<User> loginWithVCode(@RequestParam String phone){
        return userService.loginWithVCode(phone);
    }

    @ResponseBody
    @PostMapping("resetPassword")
    @ApiOperation(value = "修改密码", httpMethod = "POST", notes = "修改密码")
    public ResponseHelper resetPassword(@RequestParam String phone, @RequestParam String password){
        return userService.resetPassword(phone,password);
    }

    @ResponseBody
    @PostMapping("register")
    @ApiOperation(value = "用户注册", httpMethod = "POST", notes = "用户注册")
    public ResponseHelper register(@RequestParam String phone, @RequestParam String password){
        return userService.register(phone,password);
    }

}
