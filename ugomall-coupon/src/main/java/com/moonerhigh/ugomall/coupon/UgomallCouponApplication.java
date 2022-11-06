package com.moonerhigh.ugomall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UgomallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(UgomallCouponApplication.class, args);
    }

}
