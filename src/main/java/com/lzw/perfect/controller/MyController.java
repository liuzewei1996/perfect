package com.lzw.perfect.controller;

import com.lzw.perfect.config.ConfigBean;
import com.lzw.perfect.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {

    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Value("${myConfig.myObject.myAge}")
    private int myAge;

    @Autowired
    private ConfigBean myConfigBean;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Object test() {
        Person person = new Person();
        person.setId(3);
        person.setBirthday(new Date());
        person.setName("lihua");

        System.out.println(this.myAge);
        System.out.println(this.myName);

        System.out.println("---------");

        System.out.println(this.myConfigBean.getMyAge());
        System.out.println(this.myConfigBean.getMyName());



        return person;

    }
}