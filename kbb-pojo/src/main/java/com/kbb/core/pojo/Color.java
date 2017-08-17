package com.kbb.core.pojo;

import java.io.Serializable;

public class Color implements Serializable{
	private Integer colorId;
	private String  colorName;
	public Integer getColorId() {
		return colorId;
	}
	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}
	public String getColorName() {
		return colorName;
	}
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	public Color(Integer colorId, String colorName) {
		super();
		this.colorId = colorId;
		this.colorName = colorName;
	}
	public Color() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
