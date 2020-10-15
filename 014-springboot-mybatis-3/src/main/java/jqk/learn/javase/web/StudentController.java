package jqk.learn.javase.web;

import jqk.learn.javase.model.Student;
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
 * @date:2020/3/6 14:20
 * @author:蛙课网
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    public @ResponseBody Student queryStudentById(Integer id) {

        //调用业务层的方法
        Student student = studentService.queryStudentById(id);

        return student;
    }
}
