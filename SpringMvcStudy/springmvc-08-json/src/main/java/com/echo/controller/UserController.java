package com.echo.controller;

import com.alibaba.fastjson.JSON;
import com.echo.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController //使用@RestController 也会使其不走视图解析器，只返回json数据
public class UserController {
    //@ResponseBody   //增加了@ResponseBody就不会走视图解析器，会直接返回一个字符串 也可以不使用这个注解而在类上标注为RestController
    @RequestMapping("/j1")
    public String json1() throws JsonProcessingException {
        User user = new User();
        user.setName("孟石");
        user.setAge(23);
        user.setSex("男");
        //jackson中的包
        ObjectMapper mapper = new ObjectMapper();
        String string = mapper.writeValueAsString(user);
        return string;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        User user = new User();
        user.setName("孟石");
        user.setAge(23);
        user.setSex("男");

        User user1 = new User();
        user1.setName("孟石1");
        user1.setAge(23);
        user1.setSex("男");

        User user2 = new User();
        user2.setName("孟石2");
        user2.setAge(23);
        user2.setSex("男");
        List<User> arrayList = new ArrayList<User>();
        arrayList.add(user);
        arrayList.add(user1);
        arrayList.add(user2);
        //jackson中的包
        ObjectMapper mapper = new ObjectMapper();
        String string = mapper.writeValueAsString(arrayList);
        return string;
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.format(date);
        String string = mapper.writeValueAsString(simpleDateFormat);
        return string;
    }

    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //不适用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS,false);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(simpleDateFormat);
        Date date = new Date();
        String string = mapper.writeValueAsString(date);
        return string;
    }

    @RequestMapping("/j5")
    public String json5(){
        /**
         * fastjson
         */
        User user = new User();
        user.setName("孟石");
        user.setAge(23);
        user.setSex("男");

        User user1 = new User();
        user1.setName("孟石1");
        user1.setAge(23);
        user1.setSex("男");

        User user2 = new User();
        user2.setName("孟石2");
        user2.setAge(23);
        user2.setSex("男");
        List<User> arrayList = new ArrayList<User>();
        arrayList.add(user);
        arrayList.add(user1);
        arrayList.add(user2);

        String string = JSON.toJSONString(arrayList);
        return string;
    }
}
