package com.tmall.web.evaluate.dao;

import com.tmall.web.evaluate.model.EvaluateImg;

public interface EvaluateImgMapper {
    int deleteByPrimaryKey(String evlImgId);

    int insert(EvaluateImg record);

    int insertSelective(EvaluateImg record);

    EvaluateImg selectByPrimaryKey(String evlImgId);

    int updateByPrimaryKeySelective(EvaluateImg record);

    int updateByPrimaryKey(EvaluateImg record);
}