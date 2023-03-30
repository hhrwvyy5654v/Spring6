package com.atguigu.spring6.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.ResultSet;

public class TestBean {
    public static void main(String[] args) {
        ApplicationContext context=
                new ClassPathXmlApplicationContext("bean.xml");
        ResourceBean resourceBean=context.getBean(ResourceBean.class);
        resourceBean.parse();
    }
}
