package com.kgc.controller;

import com.kgc.pojo.Product;
import com.kgc.pojo.TakeOut;
import com.kgc.service.ProductService;
import com.kgc.service.TakeoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Qin
 * @create 2021-02-07 18:33
 */
@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    TakeoutService takeoutService;

    @RequestMapping("/getAll")
    public List<Product> getAll(){

        return productService.getAll();
    }

    @RequestMapping("/pd")
    public boolean pdkc(@RequestParam("id") Integer id, @RequestParam("cksl") Integer cksl){
        int kc=productService.seleCount(id);
        System.out.println(kc);
        if(cksl<kc){
            return true;
        }else{
            return  false;
        }
    }

    //根据id获得数量
    @RequestMapping("/cc")
    public int cc(Integer id){
        return productService.seleCount(id);
    }

    //修改库存数量
    @RequestMapping("/up")
    public int updatePro(@RequestParam("id") Integer id, @RequestParam("cksl") Integer cksl){
        return productService.updatePro(id,cksl);
    }

    //添加
    @RequestMapping("/take")
    public int addTake(TakeOut takeOut){
        return takeoutService.addTake(takeOut);
    }
}
