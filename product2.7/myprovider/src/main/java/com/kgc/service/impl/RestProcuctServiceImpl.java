package com.kgc.service.impl;

import com.kgc.mapper.ProductMapper;
import com.kgc.pojo.Product;
import com.kgc.service.RestProcuctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Qin
 * @create 2021-02-07 15:52
 */
@RestController
public class RestProcuctServiceImpl implements RestProcuctService {

    @Autowired(required = false)
    private ProductMapper productMapper;

    @RequestMapping("/getAll")
    @Override
    public List<Product> getAll() {
        return productMapper.getAll();
    }


    @RequestMapping("/update")
    @Override
    public int updatePro(@RequestParam("id") Integer id,@RequestParam("cksl") Integer cksl) {
        return productMapper.updatePro(id,cksl);
    }


    @RequestMapping("/getCount")
    @Override
    public int seleCount(Integer id) {
        return productMapper.seleCount(id);
    }
}
