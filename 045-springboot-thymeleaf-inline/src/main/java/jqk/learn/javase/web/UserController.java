package jqk.learn.javase.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:UserController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/11 10:34
 * @author:蛙课网
 */
@Controller
public class UserController {

    @RequestMapping(value = "/inline")
    public String inline(Model model) {
        model.addAttribute("data","SpringBoot inline");
        return "inline-test";
    }
}
