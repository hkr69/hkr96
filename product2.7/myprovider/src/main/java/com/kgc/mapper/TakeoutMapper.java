package com.kgc.mapper;

import com.kgc.pojo.TakeOut;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Qin
 * @create 2021-02-07 16:38
 */
@Mapper
public interface TakeoutMapper {

    public int addTake(TakeOut takeOut);
}
