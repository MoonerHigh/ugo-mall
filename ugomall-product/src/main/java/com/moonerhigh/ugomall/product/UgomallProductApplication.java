package com.moonerhigh.ugomall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UgomallProductApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(UgomallProductApplication.class,args);
//        System.out.println("商品服务启动成功！！！");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(UgomallProductApplication.class);
    }
}
