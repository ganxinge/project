package com.tmall.web.product.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * <p>title:商品以及分类实体</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午2:20:46
 */
public class CategoryOne implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -219039950512590786L;

	private String categoryId;

    private String categroySecondId;

    private String categoryName;

    private String level;

    private Date createTime;

    private String createUser;

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