package jqk.learn.javase.web;

import jqk.learn.javase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:StudentController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/7 11:04
 * @author:蛙课网
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/put")
    public @ResponseBody Object put(String key,String value) {

        studentService.put(key,value);

        return "值已成功放入redis";
    }

    @RequestMapping(value = "/get")
    public @ResponseBody String get() {
        String count = studentService.get("count");
        return "数据count为:" + count;
    }
}
