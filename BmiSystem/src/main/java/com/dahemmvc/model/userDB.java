package com.dahemmvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class userDB
{
	List<user> u=new ArrayList<user>();
    List<Bmi> bmlis=new ArrayList<Bmi>();
    
  
    int id=0;
    
   
    Connection co;
    Statement stmt;
    public Connection checkformConnection() throws Exception {
    	Class.forName("com.mysql.cj.jdbc.Driver");
		 co=DriverManager.getConnection("jdbc:mysql://localhost/BmiSystem?user=root&password=100044");
		//System.out.println("passing -> Connected with DB .....");
		  stmt = co.createStatement();
    	
		return co;
    	
    }
    
	public void adduser(String name, String password, double h, double w,char g,int age)    {
	
try {
		checkformConnection();
		 String sql = "INSERT INTO users (name,password,highest,wighet,gender,age) VALUES ('"+name+"','"+password+"',"+h+","+w+",'"+g+"',"+age+");";
		 u.add(new user(name, password, h, w));
		          stmt.executeUpdate(sql);
		          
					double bm=w/Math.pow(h, 2);
					 String sql2 = "INSERT INTO bmiv (h,w,b) VALUES ("+h+","+w+","+bm*10000+");";
					
					 stmt.executeUpdate(sql2);
}
	catch (Exception e) {
		System.out.println(e);
	}
		          
		
	
	}
	public boolean besure(String name,String password)  {
		
try {
			checkformConnection();
			ResultSet rs=stmt.executeQuery("select * from users;");
			String a,b;
			while(rs.next()) {
				a=rs.getString("name");
				b=rs.getString("password");
				id=rs.getInt("id");
				if(name.equals(a) && password.equals(b)) {
					return true;
				}
			}
}
catch(Exception e) {
	System.out.println(e);
}
		
			
		
		return false;
	}
	
	public void SrechBmilist() throws Exception {
		checkformConnection();
		ResultSet rs=stmt.executeQuery("select * from bmiv;");
		
		double h=0,w=0,bm=0;
		
		while(rs.next()) {
			if(rs.getInt("id") == id) {
			h=rs.getDouble("h");
			w=rs.getDouble("w");
			bm=rs.getDouble("b");
			bmlis.add(new Bmi(h, w, bm));
		}}
		
	}
	
	
	public List<Bmi> printbmi() throws Exception{
		bmlis.removeAll(bmlis);
		SrechBmilist();
	
		List<Bmi> im=new ArrayList<>();
		
		for (Bmi b : bmlis) {
			im.add(b);
		}
		return im;
		
	}
	public int Calories() throws Exception {
		checkformConnection();
		ResultSet rs=stmt.executeQuery("select * from users;");
		int cal=0;
		
		while(rs.next()) {
			
			if(rs.getInt("id") == id) {
			if(rs.getString("gender").equals("M")) {
				cal=(int) 
						(66.5 + (13.75 * rs.getDouble("wighet")) +
						(5.003 * rs.getDouble("highest")) 
						-( 6.75 * rs.getInt("Age")) );
			}
			else {
				cal=(int) (655.1 + (9.563 * rs.getDouble("wighet")) + (1.850 * rs.getDouble("highest")) -(4.676 * rs.getInt("Age")) );
			}
		}
		}
		return cal;
		
	}
	
	public double chbmi() throws Exception {
		checkformConnection();
		ResultSet rs=stmt.executeQuery("select * from bmiv;");
		double bmicheck=0;
		while(rs.next()) {
			if(rs.getInt("id") == id) {
			bmicheck=rs.getDouble("b");
			
		}
		}
		return bmicheck;
		
	}
	
	
	
}
