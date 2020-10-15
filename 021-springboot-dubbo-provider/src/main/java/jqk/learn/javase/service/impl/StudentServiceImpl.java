package jqk.learn.javase.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import jqk.learn.javase.service.StudentService;
import org.springframework.stereotype.Component;

/**
 * ClassName:StudentServiceImpl
 * Package:com.bjpowernode.springboot.service.impl
 * Description:
 *
 * @date:2020/3/7 14:03
 * @author:蛙课网
 */
@Component
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
//dubbo:service interface="" version="" timeout=""
public class StudentServiceImpl implements StudentService {

    @Override
    public Integer queryAllStudentCount() {

        //调用数据持久层

        return 1250;
    }
}
