package com.kgc.service.impl;

import com.kgc.mapper.TakeoutMapper;
import com.kgc.pojo.TakeOut;
import com.kgc.service.RestTakeOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Qin
 * @create 2021-02-07 16:43
 */
@RestController
public class RestTakeOutServiceImpl implements RestTakeOutService {
    @Autowired(required = false)
    private TakeoutMapper takeoutMapper;

    @RequestMapping("/addTake")
    @Override
    public int addTake(@RequestBody TakeOut takeOut) {
        return takeoutMapper.addTake(takeOut);
    }
}
