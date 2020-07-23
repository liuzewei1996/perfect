package com.lzw.perfect.domain;

import java.util.Date;

public class Person {

    private int id;

    private String name;

    private Date birthday;


    //添加get及set方法
    public int getId(){
      return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(final String name){
        this.name  = name;
    }

    public Date getBirthday(){
        return birthday;
    }
    public void setBirthday(final Date birthday){
        this.birthday = birthday;
    }
    
    

}