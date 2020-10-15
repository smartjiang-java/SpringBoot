package jqk.learn.javase.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * ClassName:UserController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/11 14:03
 * @author:蛙课网
 */
@Controller
public class UserController {

    @RequestMapping(value = "/function")
    public String function(Model model) {

        model.addAttribute("time",new Date());
        model.addAttribute("data","SpringBootHelloWorld");
        return "function";
    }
}
