package com.jpa.JPADemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	private int modelNo;
	private String brandName;
	private double cost;
	private String color;
		
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laptop(int modelNo, String brandName, double cost, String color) {
		super();
		this.modelNo = modelNo;
		this.brandName = brandName;
		this.cost = cost;
		this.color = color;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Laptop [modelNo=" + modelNo + ", brandName=" + brandName + ", cost=" + cost + ", color=" + color + "]";
	}
	
	
}
