package jqk.learn.javase.service.impl;

import jqk.learn.javase.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * ClassName:StudentServiceImpl
 * Package:com.bjpowernode.springboot.service.impl
 * Description:
 *
 * @date:2020/3/9 9:20
 * @author:蛙课网
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello(String msg) {
        return "Say : " + msg;
    }
}
