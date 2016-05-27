package com.tmall.web.message.dao;

import com.tmall.web.message.model.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(String messageId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(String messageId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}