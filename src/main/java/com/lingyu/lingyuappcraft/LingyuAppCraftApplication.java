package com.lingyu.lingyuappcraft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.lingyu.lingyuappcraft.mapper")
public class LingyuAppCraftApplication {
    public static void main(String[] args) {
        System.out.println("执行成功");
        SpringApplication.run(LingyuAppCraftApplication.class, args);
    }
}
