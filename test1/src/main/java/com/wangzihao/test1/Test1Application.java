package com.wangzihao.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {

    public static void main(String[] args) {
        SpringApplication.run(Test1Application.class, args);
        test1();
    }

    public static void test1(){
        System.out.println("hello world ");
        System.out.println("i am master");
        System.out.println("i write 1");
        System.out.println("i write 2");
    }
    public static void test1wzh(){
        System.out.println("hello world ");
        System.out.println("i am wzh");
        System.out.println("wzh write 1");
        System.out.println("wzh write 2");
    }
    public static void function1(){
        System.out.println("i am function1 !");
        System.out.println("function1 have 1");
        System.out.println("function1 have 2");
    }

}
