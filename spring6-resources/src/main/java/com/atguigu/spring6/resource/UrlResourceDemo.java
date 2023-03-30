package com.atguigu.spring6.resource;

import org.springframework.core.io.UrlResource;

//演示UrlResource访问网络资源
public class UrlResourceDemo {
    public static void main(String[] args) {
        //http前缀
        //loadUrlResource("http://www.baidu.com");

        //file前端
        loadUrlResource("file:atguigu.txt");
    }

    ///访问前缀http、file
    public static void loadUrlResource(String path) {
        try {
            //创建Resource实现类的对象 UrlResource
            UrlResource url = new UrlResource(path);
            //获取资源信息
            System.out.println(url.getFilename());
            System.out.println(url.getURL());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
