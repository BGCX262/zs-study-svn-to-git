package com.zs.amysou.webclient.service;

import org.apache.ibatis.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestServiceJUnit {
	
	@Test
    public void userServiceTest(){
		LogFactory.useLog4JLogging();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestService service = (TestService)context.getBean("testService");
        com.zs.amysou.webclient.pojo.Test t1 = new com.zs.amysou.webclient.pojo.Test();
        t1.setId(6);
        t1.setName("1111111");
        t1.setSex(1);
        
        com.zs.amysou.webclient.pojo.Test t2 = new com.zs.amysou.webclient.pojo.Test();
        t2.setId(1);
        t2.setName("22222222");
        t2.setSex(1);
        
        service.insertTest(t1,t2);
        
    }
}
