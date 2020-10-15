package jqk.learn.javase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:IndexController
 * Package:com.bjpowernode.springboot.controller
 * Description:
 *
 * @date:2020/3/5 9:57
 * @author:蛙课网
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/springboot/say")
    public @ResponseBody String say() {
        return "Hello,SpringBoot!";
    }
}
