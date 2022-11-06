package com.moonerhigh.ugomall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.moonerhigh.ugomall.member.feign")
public class UgomallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(UgomallMemberApplication.class, args);
    }

}
