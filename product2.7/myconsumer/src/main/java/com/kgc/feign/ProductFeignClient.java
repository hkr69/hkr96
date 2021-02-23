package com.kgc.feign;

import com.kgc.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Qin
 * @create 2021-02-07 16:58
 */
@FeignClient(name="myprovider")
public interface ProductFeignClient {

    @RequestMapping("/getAll")
    public List<Product> getAll();



    @RequestMapping("/update")
    public int updatePro(@RequestParam("id") Integer id,@RequestParam("cksl") Integer cksl);

    @RequestMapping("/getCount")
    public int seleCount(@RequestParam("id") Integer id);
}
