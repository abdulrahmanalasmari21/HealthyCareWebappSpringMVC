package com.dahemmvc.model;

public class user {
	

	private String name;
	private String password;
	public double h;
	public double w;
	
	
	
	
	public user( String name, String password, double h, double w) {
		super();
		
		this.name = name;
		this.password = password;
		this.h = h;
		this.w = w;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	
}
