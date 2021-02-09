package com.echo.pojo;

import org.springframework.beans.factory.annotation.Value;

public class User {
    @Value("Echo")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
