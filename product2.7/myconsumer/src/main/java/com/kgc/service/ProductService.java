package com.kgc.service;

import com.kgc.pojo.Product;

import java.util.List;

/**
 * @author Qin
 * @create 2021-02-07 17:03
 */
public interface ProductService {

    public List<Product> getAll();

    public int updatePro(Integer id,Integer cksl);

    public int seleCount(Integer id);
}
