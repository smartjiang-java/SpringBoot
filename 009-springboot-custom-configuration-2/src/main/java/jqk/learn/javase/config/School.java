package jqk.learn.javase.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName:School
 * Package:com.bjpowernode.springboot.config
 * Description:
 *
 * @date:2020/3/5 14:21
 * @author:蛙课网
 */
@Component//将此类将给spring容器进行管理
@ConfigurationProperties(prefix = "school")
public class School {

    private String name;

    private String websit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsit() {
        return websit;
    }

    public void setWebsit(String websit) {
        this.websit = websit;
    }
}
