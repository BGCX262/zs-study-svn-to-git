package com.zs.amysou.webclient.control.login;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoginControlTest {
    @Test
    public void userServiceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginControl control = (LoginControl)context.getBean("loginControl");
    	System.out.println(control.findTestById(1).getName());
    }
}