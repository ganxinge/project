package com.tmall.web.address.dao;

import com.tmall.web.address.model.ReceiptAddress;

public interface ReceiptAddressMapper {
    int deleteByPrimaryKey(String addressId);

    int insert(ReceiptAddress record);

    int insertSelective(ReceiptAddress record);

    ReceiptAddress selectByPrimaryKey(String addressId);

    int updateByPrimaryKeySelective(ReceiptAddress record);

    int updateByPrimaryKey(ReceiptAddress record);
}