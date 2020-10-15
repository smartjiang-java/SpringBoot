package jqk.learn.javase.service.impl;

import jqk.learn.javase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * ClassName:StudentServiceImpl
 * Package:com.bjpowernode.springboot.service.impl
 * Description:
 *
 * @date:2020/3/7 11:06
 * @author:蛙课网
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public void put(String key, String value) {

        redisTemplate.opsForValue().set(key,value);

    }

    @Override
    public String get(String key) {

        String count = (String) redisTemplate.opsForValue().get(key);

        return count;
    }
}
