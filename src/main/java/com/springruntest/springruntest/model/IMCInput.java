package com.springruntest.springruntest.model;

import java.math.BigDecimal;

public class IMCInput {
	
	private BigDecimal height;
	private BigDecimal Weight;
	public BigDecimal getHeight() {
		return height;
	}
	public void setHeight(BigDecimal height) {
		this.height = height;
	}
	public BigDecimal getWeight() {
		return Weight;
	}
	public void setWeight(BigDecimal weight) {
		Weight = weight;
	}
	public IMCInput(BigDecimal height, BigDecimal weight) {
		super();
		this.height = height;
		Weight = weight;
	}
	public IMCInput() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
