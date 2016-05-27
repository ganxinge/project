package com.tmall.web.buyrecord.dao;

import com.tmall.web.buyrecord.model.BuyRecord;

public interface BuyRecordMapper {
    int deleteByPrimaryKey(String recordId);

    int insert(BuyRecord record);

    int insertSelective(BuyRecord record);

    BuyRecord selectByPrimaryKey(String recordId);

    int updateByPrimaryKeySelective(BuyRecord record);

    int updateByPrimaryKey(BuyRecord record);
}