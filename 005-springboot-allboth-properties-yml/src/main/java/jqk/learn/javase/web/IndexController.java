package jqk.learn.javase.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:IndexController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/5 11:07
 * @author:蛙课网
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    public @ResponseBody String say() {
        return "Hello SpringBoot";
    }
}
