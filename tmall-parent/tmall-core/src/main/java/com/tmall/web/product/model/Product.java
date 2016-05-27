package com.tmall.web.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * <p>title:产品信息</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午2:18:08
 */
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4165040278454344586L;

	private String productId;

    private String productNumbre;

    private String productName;

    private String imageUrl;

    private BigDecimal price;

    private BigDecimal discountPrice;

    private BigDecimal discount;

    private String isGrounding;

    private String categoryId;

    private String categroySecondId;

    private String categroyThirdId;

    private String evaluateId;

    private String brandName;

    private BigDecimal distributionFee;

    private String spec;

    private Date createTime;

    private String createUser;

    private String content;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductNumbre() {
        return productNumbre;
    }

    public void setProductNumbre(String productNumbre) {
        this.productNumbre = productNumbre;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getIsGrounding() {
        return isGrounding;
    }

    public void setIsGrounding(String isGrounding) {
        this.isGrounding = isGrounding;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategroySecondId() {
        return categroySecondId;
    }

    public void setCategroySecondId(String categroySecondId) {
        this.categroySecondId = categroySecondId;
    }

    public String getCategroyThirdId() {
        return categroyThirdId;
    }

    public void setCategroyThirdId(String categroyThirdId) {
        this.categroyThirdId = categroyThirdId;
    }

    public String getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(String evaluateId) {
        this.evaluateId = evaluateId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public BigDecimal getDistributionFee() {
        return distributionFee;
    }

    public void setDistributionFee(BigDecimal distributionFee) {
        this.distributionFee = distributionFee;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}