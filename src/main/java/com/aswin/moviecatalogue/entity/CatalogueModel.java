package com.aswin.moviecatalogue.entity;

public class CatalogueModel {
	private String name;
	private String desc;
	private Integer rating;
	
	public CatalogueModel(String name, String desc, Integer rating) {
		this.name = name;
		this.desc = desc;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	
}