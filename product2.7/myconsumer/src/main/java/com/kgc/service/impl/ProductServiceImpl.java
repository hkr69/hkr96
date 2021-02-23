package com.kgc.service.impl;

import com.kgc.feign.ProductFeignClient;
import com.kgc.pojo.Product;
import com.kgc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Qin
 * @create 2021-02-07 17:06
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductFeignClient productFeignClient;

    @Override
    public List<Product> getAll() {
        return productFeignClient.getAll();
    }


    @Override
    public int updatePro(Integer id,Integer cksl) {
        return productFeignClient.updatePro(id,cksl);
    }



    @Override
    public int seleCount(Integer id) {
        return productFeignClient.seleCount(id);
    }
}
