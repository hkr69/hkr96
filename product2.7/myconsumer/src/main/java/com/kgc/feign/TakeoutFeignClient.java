package com.kgc.feign;

import com.kgc.pojo.TakeOut;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Qin
 * @create 2021-02-07 17:00
 */
@FeignClient(name="myprovider")
public interface TakeoutFeignClient {

    @RequestMapping("/addTake")
    public int addTake(@RequestBody TakeOut takeOut);
}
