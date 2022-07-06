package com.dahemmvc.co;

import java.io.IOException;

import javax.enterprise.inject.Model;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dahemmvc.Serv.*;
import com.dahemmvc.model.*;

@Controller
public class loginco {
	@Autowired
	userDB ub;
	
	@RequestMapping(value="/reguser",method = RequestMethod.POST)
	public String reg(@RequestParam String name,@RequestParam String password,@RequestParam double h,@RequestParam double w,
			@RequestParam char g,@RequestParam int age)
	{
		ub.adduser(name, password, h, w, g, age);
		return "login";
	
	
	
}
	
	@RequestMapping(value="/logo",method = RequestMethod.POST)
	public String besure(@RequestParam String name,@RequestParam String password,ModelMap m)
	{
		if(!ub.besure(name, password)) {
			m.addAttribute("r", "plese insert correct password Or name");
			return "login";
		}
		return "Welcome";
	
	
	
}
	@RequestMapping(value="/signup")
	public String v()
	{
		
		return "Register";}
	
	
		@RequestMapping(value="/back")
		public String button()
		{
			
			return "login";
		
		
}
		
		@RequestMapping(value="/bmi")
		public String bmi(ModelMap mp,ModelMap mbmi) throws Exception
		{
			
			mp.addAttribute("listofBmi", ub.printbmi());
			mbmi.addAttribute("cbmi",ub.chbmi());
			return "Bmi";
		
		
}
		@RequestMapping(value="/calo")
		public String cal(ModelMap m) throws Exception
		{
			m.addAttribute("cal", ub.Calories());
			return "calories";
		
		
}
		
}
	
	
	
	
		
	


