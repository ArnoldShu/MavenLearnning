package com.arnold.www;

import org.junit.Test;

/**
 * @ClassName HelloWorld2Test
 * @Description
 * @Todo
 * @Author Arnold
 * @Date 2019/2/1 15:19
 * @Version 1.0
 **/
public class HelloWorld2Test {
    @Test
    public void HelloWorld2Test(){
        HelloWorld helloWorld = new HelloWorld();
        String results = helloWorld.sayHello("litingwei");
        System.out.println("Hello litingwei! I am John"+results);
    }
}
