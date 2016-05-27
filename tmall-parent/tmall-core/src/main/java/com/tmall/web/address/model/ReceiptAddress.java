package com.tmall.web.address.model;

import java.io.Serializable;
import java.util.Date;

public class ReceiptAddress implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5105770462272656967L;

	private String addressId;

    private String userId;

    private String province;

    private String city;

    private String address;

    private String postCode;

    private String reveiver;

    private String phone;

    private Date createTime;

    private String createUser;

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getReveiver() {
        return reveiver;
    }

    public void setReveiver(String reveiver) {
        this.reveiver = reveiver;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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