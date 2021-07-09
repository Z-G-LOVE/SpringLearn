package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @作者: Administrator
 * @时间: 2021/7/5 11:06
 * @描述: 创建一个实体类User
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private String user_name;
    private String user_ID;
    private BigDecimal account_money;
    private String user_phone;
    private String user_mail;
}
