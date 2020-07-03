package com.louie.test;

import com.louie.entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Student student = (Student) classPathXmlApplicationContext.getBean("student");
        System.out.println(student.toString());
    }
}
