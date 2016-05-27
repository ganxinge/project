package com.tmall.web.evaluate.dao;

import com.tmall.web.evaluate.model.Evaluate;

public interface EvaluateMapper {
    int deleteByPrimaryKey(String evaluateId);

    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    Evaluate selectByPrimaryKey(String evaluateId);

    int updateByPrimaryKeySelective(Evaluate record);

    int updateByPrimaryKey(Evaluate record);
}