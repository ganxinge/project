package com.tmall.web.cart.dao;

import com.tmall.web.cart.model.ShoppingCart;

public interface ShoppingCartMapper {
    int deleteByPrimaryKey(String cartId);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(String cartId);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);
}