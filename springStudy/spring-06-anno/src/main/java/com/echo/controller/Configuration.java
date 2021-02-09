package com.echo.controller;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public List<String> getHobbies(){
        List<String> list = new ArrayList<String>();
        list.add("篮球");
        list.add("跳");
        return list;
    }
    @Bean
    public Map<String,String> getInfo(){
        Map<String,String> info = new HashMap<String, String>();
        info.put("ID","10010");
        info.put("Author","Proxy");
        return info;
    }
}
