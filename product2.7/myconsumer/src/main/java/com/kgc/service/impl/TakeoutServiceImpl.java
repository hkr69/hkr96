package com.kgc.service.impl;

import com.kgc.feign.TakeoutFeignClient;
import com.kgc.pojo.TakeOut;
import com.kgc.service.TakeoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Qin
 * @create 2021-02-07 17:08
 */
@Service
public class TakeoutServiceImpl implements TakeoutService {

    @Autowired
    private TakeoutFeignClient takeoutFeignClient;

    @Override
    public int addTake(TakeOut takeOut) {
        return takeoutFeignClient.addTake(takeOut);
    }
}
