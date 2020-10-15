package jqk.learn.javase.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:UserController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/11 11:12
 * @author:蛙课网
 */
@Controller
public class UserController {

    @RequestMapping(value = "/operator")
    public String operator(Model model) {
        model.addAttribute("sex",1);
        model.addAttribute("flag",true);
        return "operator";
    }
}
