package com.cyn.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cyn.gulimall.product.entity.BrandEntity;
import com.cyn.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("apple苹果");

       /* brandEntity.setDescript("");
        brandEntity.setName("三星");
        brandService.save(brandEntity);*/

        // brandService.updateById(brandEntity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(e -> System.out.println(e));
        System.out.println("save success");
    }

}
