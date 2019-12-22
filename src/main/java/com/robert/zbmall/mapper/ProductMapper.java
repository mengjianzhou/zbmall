package com.robert.zbmall.mapper;

import com.robert.zbmall.bean.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2019/12/22
 */
@Mapper
public interface ProductMapper {

    List<Product> getList();

}
