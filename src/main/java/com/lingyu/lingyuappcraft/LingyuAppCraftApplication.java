package com.lingyu.lingyuappcraft;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.lingyu.lingyuappcraft.mapper")
public class LingyuAppCraftApplication {
    public static void main(String[] args) {
        System.out.println("执行成功");
        SpringApplication.run(LingyuAppCraftApplication.class, args);
        //在线访问文档网址
        System.out.println("在线访问文档地址: http://localhost:8123/api/doc.html");

    }
}
