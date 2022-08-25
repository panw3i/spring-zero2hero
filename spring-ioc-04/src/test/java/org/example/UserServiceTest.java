package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

public class UserServiceTest{

    @Test
    public void applicationTest() {
        // 得到Spring容器上下文环境
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        // userService
        UserService userService = (UserService) ac.getBean("userService");
        userService.test();
    }

    @Test
    public void foo(){
        System.out.println(1);
    }
}