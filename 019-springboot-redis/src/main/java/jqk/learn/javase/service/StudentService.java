package jqk.learn.javase.service;

/**
 * ClassName:StudentService
 * Package:com.bjpowernode.springboot.service
 * Description:
 *
 * @date:2020/3/7 11:06
 * @author:蛙课网
 */
public interface StudentService {

    /**
     * 将值存放到redis中
     * @param key
     * @param value
     */
    void put(String key, String value);

    /**
     * 从redis中获取指定key的值
     * @param key
     * @return
     */
    String get(String key);
}
