package jqk.learn.javase.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:UserController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/10 10:32
 * @author:蛙课网
 */
@Controller
public class UserController {

    @RequestMapping(value = "/message")
    public String message(Model model) {

        model.addAttribute("data","SpringBoot集成Thymeleaf模版引擎");

        return "message";
    }
}
