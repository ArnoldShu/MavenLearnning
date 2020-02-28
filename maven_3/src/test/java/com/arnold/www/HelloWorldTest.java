package com.arnold.www;

import org.junit.Test;

/**
 * @ClassName HelloWorldTest
 * @Description
 * @Todo
 * @Author Arnold
 * @Date 2019/1/31 16:32
 * @Version 1.0
 **/
public class HelloWorldTest {
    @Test
    public void testHello(){
        HelloWorld helloWorld = new HelloWorld();
        String results = helloWorld.sayHello("litingwei");
        System.out.println("Hello litingwei!"+results);
    }
}
