package jqk.learn.javase.web;

import jqk.learn.javase.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:UserController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/11 10:48
 * @author:蛙课网
 */
@Controller
public class UserController {


    @RequestMapping(value = "/literal")
    public String literal(Model model) {

        model.addAttribute("sex",1);
        model.addAttribute("data","SpringBoot Data");
        model.addAttribute("flag",true);

        User user = new User();
        user.setId(1001);
        user.setUsername("lisi");
        model.addAttribute("user",user);

        User userDetail = new User();
        model.addAttribute("userDetail",userDetail);

        return "literal";
    }

    @RequestMapping(value = "/splice")
    public String splice(Model model) {
        model.addAttribute("totalRows",123);
        model.addAttribute("totalPage",13);
        model.addAttribute("currentPage",2);

        return "splice";
    }
}
