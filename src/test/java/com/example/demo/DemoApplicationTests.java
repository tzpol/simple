package com.example.demo;

import com.example.demo.mbg.model.PmsBrand;
import com.example.demo.service.PmsBrandService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@SpringBootTest
@Slf4j
class DemoApplicationTests {
    @Autowired
    private PmsBrandService pmsBrandServiece;

    @Test
    public void testMethod() {
        List<PmsBrand> brandList = pmsBrandServiece.listAllBrand();
        log.info("testMethod:{}",brandList);
    }
}
