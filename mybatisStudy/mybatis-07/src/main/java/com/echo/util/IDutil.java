package com.echo.util;

import org.junit.Test;

import java.util.UUID;

public class IDutil {
    public static String getId(){
        return UUID.randomUUID().toString().replace(".","-");
    }
    @Test
    public void testUUID(){
        System.out.println(IDutil.getId());
    }
}
