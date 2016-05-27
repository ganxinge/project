package com.tmall.web.evaluate.model;

import java.io.Serializable;

public class EvaluateImg implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7859787471761920743L;

	private String evlImgId;

    private String imageUrl;

    private String imageName;

    public String getEvlImgId() {
        return evlImgId;
    }

    public void setEvlImgId(String evlImgId) {
        this.evlImgId = evlImgId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}