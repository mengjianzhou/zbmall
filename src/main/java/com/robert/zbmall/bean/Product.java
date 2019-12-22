package com.robert.zbmall.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2019/12/22
 */
@Data
public class Product {

    private Integer id;

    private String name;

    private BigDecimal price;

    private Integer quanity;
}
