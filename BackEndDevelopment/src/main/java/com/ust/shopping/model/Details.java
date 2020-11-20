package com.ust.shopping.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document
public class Details {

	@Id
	private Integer productId;
	private String productName;
	private String expiryDate;
	private String materialUsed;
	private String decription;
	
	//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM-dd-yyyy")
	private String mfgDate;
	private String manufacturer;
	private String rating;
	private String itemsInBox;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getMaterialUsed() {
		return materialUsed;
	}
	public void setMaterialUsed(String materialUsed) {
		this.materialUsed = materialUsed;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}
	public String getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getItemsInBox() {
		return itemsInBox;
	}
	public void setItemsInBox(String itemsInBox) {
		this.itemsInBox = itemsInBox;
	}
	@Override
	public String toString() {
		return "Details [productId=" + productId + ", productName=" + productName + ", expiryDate=" + expiryDate
				+ ", materialUsed=" + materialUsed + ", decription=" + decription + ", mfgDate=" + mfgDate
				+ ", manufacturer=" + manufacturer + ", rating=" + rating + ", itemsInBox=" + itemsInBox + "]";
	}

	
}
