package com.tmall.web.product.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * <p>title:商品三级分类</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午2:21:24
 */
public class CategoryThird implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8223964568600096452L;

	private String categoryThirdId;

    private String categoryName;

    private String level;

    private String brandId;

    private Date createTime;

    private String createUser;

    public String getCategoryThirdId() {
        return categoryThirdId;
    }

    public void setCategoryThirdId(String categoryThirdId) {
        this.categoryThirdId = categoryThirdId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
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