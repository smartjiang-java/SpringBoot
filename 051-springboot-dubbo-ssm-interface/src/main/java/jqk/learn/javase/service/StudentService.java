package jqk.learn.javase.service;

import jqk.learn.javase.model.Student;

/**
 * ClassName:StudentService
 * Package:com.bjpowernode.springboot.service
 * Description:
 *
 * @date:2020/3/11 14:54
 * @author:蛙课网
 */
public interface StudentService {

    /**
     * 根据学生ID查询详情
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);
}
