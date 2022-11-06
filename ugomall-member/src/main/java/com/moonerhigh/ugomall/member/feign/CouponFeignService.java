package com.moonerhigh.ugomall.member.feign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("ugomall-coupon")
public interface CouponFeignService {

}
