package com.atguigu.spring6.resourceloader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class ResourceLoaderDemo {
    @Test
    public void demo1(){
        ApplicationContext context=new ClassPathXmlApplicationContext();
        //通过ApplicationContext访问资源
        //Application实例获取Resource实例时
        //默认采用与ApplicationContext相同的资源访策略
        Resource resource=context.getResource("atguigu.txt");
        System.out.println(resource.getFilename());
    }
    @Test
    public void demo2() {
        ApplicationContext context = new FileSystemXmlApplicationContext();
        Resource resource = context.getResource("atguigu.txt");
        System.out.println(resource.getFilename());
    }

}
