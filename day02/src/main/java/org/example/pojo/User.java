package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @作者: Administrator
 * @时间: 2021/7/4 10:29
 * @描述: 创建实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private List<String> goods;// 商品集合
    private Integer[] ids; // 商品id数组
    private Map<String, BigDecimal> value; // 商品价格表
    private List<Goods> goodAttributes;// 商品详细属性
}
