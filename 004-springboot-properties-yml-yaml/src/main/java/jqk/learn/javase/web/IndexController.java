package jqk.learn.javase.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:IndexController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/5 10:52
 * @author:蛙课网
 */
@Controller
public class IndexController {

   //http://localhost:9090/yaml/say?message=jiangqikun
    @RequestMapping(value = "/say")
    public @ResponseBody Object say(String message) {

        return "Say:Hello " + message;
    }
}
