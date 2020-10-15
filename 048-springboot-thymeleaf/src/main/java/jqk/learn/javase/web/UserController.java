package jqk.learn.javase.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName:UserController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/11 11:50
 * @author:蛙课网
 */
@Controller
public class UserController {

    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request,Model model,Integer id) {
        model.addAttribute("username","lisi");

        request.getSession().setAttribute("data","sessionData");

        return "index";
    }
}
