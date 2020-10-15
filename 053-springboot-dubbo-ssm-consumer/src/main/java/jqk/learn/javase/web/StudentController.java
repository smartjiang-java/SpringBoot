package jqk.learn.javase.web;

import com.alibaba.dubbo.config.annotation.Reference;
import jqk.learn.javase.model.Student;
import jqk.learn.javase.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:StudentController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/11 14:52
 * @author:蛙课网
 */
@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",check = false)
    private StudentService studentService;

    @RequestMapping(value = "/student/detail/{id}")
    public String studentDetail(Model model,
                                @PathVariable("id") Integer id) {

        //根据学生ID查询详情
        Student student = studentService.queryStudentById(id);

        model.addAttribute("student",student);

        return "studentDetail";
    }
}
