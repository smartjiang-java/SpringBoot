package jqk.learn.javase.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName:IndexController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/5 14:48
 * @author:蛙课网
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    public ModelAndView say() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Hello,SpringBoot");
        mv.setViewName("say");
        return mv;
    }

    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("message","HelloWorld");
        return "say";
    }
}
