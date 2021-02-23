package com.kgc.service;

import com.kgc.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Qin
 * @create 2021-02-07 15:51
 */
public interface RestProcuctService {
    //查询所有
    public List<Product> getAll();

    //修改
    public int updatePro(Integer id,Integer cksl);

    //根据id查询库存数量
    public int seleCount(Integer id);
}
