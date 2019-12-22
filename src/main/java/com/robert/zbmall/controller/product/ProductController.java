package com.robert.zbmall.controller.product;

import com.alibaba.fastjson.JSON;
import com.robert.zbmall.bean.Product;
import com.robert.zbmall.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 产品
 *
 * @author zhaob
 * @create 2019/12/22
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("list")
    @ResponseBody
    public List<Product> getList(){
        List<Product> productList = productService.getList();
        return productList;
    }
}
