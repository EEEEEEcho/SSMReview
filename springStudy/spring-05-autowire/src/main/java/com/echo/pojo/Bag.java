package com.echo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bag {
    @Value("Prada")
    private String bagName;

    public String getBagName() {
        return bagName;
    }

    public void setBagName(String bagName) {
        this.bagName = bagName;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "bagName='" + bagName + '\'' +
                '}';
    }
}
