package com.tmall.web.evaluate.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Evaluate implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1959945680736124043L;

	private String evaluateId;

    private String userId;

    private String orderNumber;

    private String spec;

    private BigDecimal score;

    private BigDecimal distributionFee;

    private String productEvaluate;

    private String serviceEvaluate;

    private String productEvalLevel;

    private String serviceEvalLevel;

    private String evalImgId;

    private String userImage;

    private Date createTime;

    private String createUser;

    public String getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(String evaluateId) {
        this.evaluateId = evaluateId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getDistributionFee() {
        return distributionFee;
    }

    public void setDistributionFee(BigDecimal distributionFee) {
        this.distributionFee = distributionFee;
    }

    public String getProductEvaluate() {
        return productEvaluate;
    }

    public void setProductEvaluate(String productEvaluate) {
        this.productEvaluate = productEvaluate;
    }

    public String getServiceEvaluate() {
        return serviceEvaluate;
    }

    public void setServiceEvaluate(String serviceEvaluate) {
        this.serviceEvaluate = serviceEvaluate;
    }

    public String getProductEvalLevel() {
        return productEvalLevel;
    }

    public void setProductEvalLevel(String productEvalLevel) {
        this.productEvalLevel = productEvalLevel;
    }

    public String getServiceEvalLevel() {
        return serviceEvalLevel;
    }

    public void setServiceEvalLevel(String serviceEvalLevel) {
        this.serviceEvalLevel = serviceEvalLevel;
    }

    public String getEvalImgId() {
        return evalImgId;
    }

    public void setEvalImgId(String evalImgId) {
        this.evalImgId = evalImgId;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}