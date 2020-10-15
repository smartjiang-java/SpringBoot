package jqk.learn.javase.web;

import jqk.learn.javase.config.Abc;
import jqk.learn.javase.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:IndexController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/5 14:24
 * @author:蛙课网
 */
@Controller
public class IndexController {

    @Autowired
    private School school;

    @Autowired
    private Abc abc;

    @RequestMapping(value = "/say")
    public @ResponseBody String say() {


        return "school.name="+school.getName()+"-----school.websit="+school.getWebsit() + "====abc.name"+abc.getName()+"===abc.websit="+abc.getWebsit();
    }
}
