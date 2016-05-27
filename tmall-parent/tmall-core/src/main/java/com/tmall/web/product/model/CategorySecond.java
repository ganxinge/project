package com.tmall.web.product.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * <p>title:商品分类二级实体</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午2:21:05
 */
public class CategorySecond implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3690192500808307481L;

	private String categorySecondId;

    private String categoryThirdId;

    private String categoryName;

    private String level;

    private Date createTime;

    private String createUser;

    public String getCategorySecondId() {
        return categorySecondId;
    }

    public void setCategorySecondId(String categorySecondId) {
        this.categorySecondId = categorySecondId;
    }

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