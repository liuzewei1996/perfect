package com.lzw.perfect.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: springlearn
 * @Package: com.lzw.springlearn.config
 * @ClassName: myConfigBean
 * @Author: liuze
 * @Description: ${description}
 * @Date: 2020/7/16 9:07
 * @Version: 1.0
 */

@Configuration
public class ConfigBean {
    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Value("${myConfig.myObject.myAge}")
    private int myAge;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }
}
