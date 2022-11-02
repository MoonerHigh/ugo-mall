package com.moonerhigh.ugomall.product;

import com.moonerhigh.ugomall.product.dto.BrandDTO;
import com.moonerhigh.ugomall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UgomallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setName("IPhone14 ProMax 1TB 远峰蓝");
        brandDTO.setDescript("Apple phone");
        brandService.save(brandDTO);
        System.out.println("保存成功！");
    }

}
