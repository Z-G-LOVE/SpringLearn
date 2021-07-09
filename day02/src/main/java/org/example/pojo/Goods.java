package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @作者: Administrator
 * @时间: 2021/7/4 11:25
 * @描述: 创建一个商品属性的实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods implements Serializable {
    private String good_name;
    private BigDecimal good_price;
    private Integer good_ID;
}
