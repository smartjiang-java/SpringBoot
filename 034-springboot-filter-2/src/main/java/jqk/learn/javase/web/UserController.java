package jqk.learn.javase.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:UserController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/9 14:10
 * @author:蛙课网
 */
@Controller
public class UserController {


    @RequestMapping(value = "/user/detail")
    public @ResponseBody String userDetail() {
        return "/user/detail";
    }

    @RequestMapping(value = "/center")
    public @ResponseBody String center() {
        return "center";
    }

}
