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
 * @date:2020/3/6 15:04
 * @author:蛙课网
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/update")
    public @ResponseBody Object update(Integer id,String name) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int updateCount = studentService.updateStudentById(student);

        return "修改学生编号为"+id+"的姓名修改结果:"+updateCount;
    }
}
