package com.kgc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author Qin
 * @create 2021-02-07 15:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TakeOut implements Serializable {
    private Integer id;
    private Integer quantity;
    private Date outDate;
    private String handler;
    private Integer productId;
}
