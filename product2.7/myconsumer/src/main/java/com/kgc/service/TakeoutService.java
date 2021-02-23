package com.kgc.service;

import com.kgc.pojo.TakeOut;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Qin
 * @create 2021-02-07 17:05
 */
public interface TakeoutService {

    public int addTake(@RequestBody TakeOut takeOut);
}
