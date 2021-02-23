package com.kgc.mapper;

import com.kgc.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Qin
 * @create 2021-02-07 15:41
 */
@Mapper
public interface ProductMapper {
    //查询所有
    public List<Product> getAll();

    //修改
    public int updatePro(@Param("id") Integer id,@Param("cksl") Integer cksl);

    //根据id查询库存
    public int seleCount(Integer id);
}
