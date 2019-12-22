package com.robert.zbmall.service.product.impl;

import com.robert.zbmall.bean.Product;
import com.robert.zbmall.mapper.ProductMapper;
import com.robert.zbmall.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2019/12/22
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getList() {
        return productMapper.getList();
    }
}
