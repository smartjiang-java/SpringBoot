package jqk.learn.javase.service;

import jqk.learn.javase.model.Student;

/**
 * ClassName:StudentService
 * Package:com.bjpowernode.springboot.service
 * Description:
 *
 * @date:2020/3/6 15:06
 * @author:蛙课网
 */
public interface StudentService {

    /**
     * 根据学生ID修改学生信息
     * @param student
     * @return
     */
    int updateStudentById(Student student);
}
