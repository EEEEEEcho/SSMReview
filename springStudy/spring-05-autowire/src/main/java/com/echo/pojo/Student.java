package com.echo.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    @Autowired
    private Bag bag;
    @Autowired
    private Pen pen;

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    @Override
    public String toString() {
        return "Student{" +
                "bag=" + bag +
                ", pen=" + pen +
                '}';
    }
}
