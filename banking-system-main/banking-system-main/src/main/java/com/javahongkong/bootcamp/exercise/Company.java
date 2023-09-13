package com.javahongkong.bootcamp.exercise;

public class Company extends AccountHolder {
	private String companyName;
	private int taxId;

	public Company(String companyName, int taxId) {
		super(taxId);
		this.companyName = companyName;
		
	}

	public String getCompanyName() {
		return this.companyName;
	}
}
