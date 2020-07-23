package com.lzw.perfect.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: springlearn
 * @Package: com.lzw.springlearn.config
 * @ClassName: myConfig
 * @Author: liuze
 * @Description: ${description}
 * @Date: 2020/7/16 9:09
 * @Version: 1.0
 */
@Configuration
public class MyConfig {

    @Bean
    public ConfigBean myConfigBean(){
        return new ConfigBean();
    }
}
