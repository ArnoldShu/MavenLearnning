package com.arnold.www;

/**
 * @ClassName HelloWorld
 * @Description
 * @Todo
 * @Author Arnold
 * @Date 2019/1/31 16:30
 * @Version 1.0
 **/
public class HelloWorld2 {
    public String sayHelloWorld(String name){
        HelloWorld hello = new HelloWorld();
        String str = hello.sayHello(name)+" I am "+this.getMyName();
        System.out.println(str);
        return str;
    }
    public String getMyName(){
        return "John";
    }
}
