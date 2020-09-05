package com.itheima.controller;

import com.itheima.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author tangkaihua
 * @create 2020-05-27-23:46
 */
@Controller
@ConfigurationProperties(prefix = "person")
public class QuickStartController {
//    @Value("${person.name}")
    private String name;

//    private Person person;
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
//        person = new Person();
        return "Hello World@@@!" + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
