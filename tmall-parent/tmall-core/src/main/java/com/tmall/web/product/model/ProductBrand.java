package com.tmall.web.product.model;

import java.io.Serializable;

/**
 * 
 * <p>title:商品品牌</p>
 * <p>description:</p>
 * @author ganxinge
 * @date 2016年5月24日 下午2:18:36
 */
public class ProductBrand implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6590848608637481108L;

	private String brandId;

    private String brandName;

    private String brandLogo;

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }
}