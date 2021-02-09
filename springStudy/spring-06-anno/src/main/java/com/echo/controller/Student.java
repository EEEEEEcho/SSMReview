package com.echo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Student {
    private Address address;
    @Autowired
    private List<String> hobbies;
    @Autowired
    private Map<String,String> info;

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                ", hobbies=" + hobbies +
                ", info=" + info +
                '}';
    }

    public Address getAddress() {
        return address;
    }
    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }
}
