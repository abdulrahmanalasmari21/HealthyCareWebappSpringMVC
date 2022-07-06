package com.dahemmvc.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Bmi {
	double h,w,b;

	public Bmi(double h, double w, double b) {
		super();
		this.h = h;
		this.w = w;
		this.b = b;
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

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Bmi [Your highest=" + h + ", Your Wight=" + w + ", Your Bmi=" + b + "]";
	}

	
	
}
