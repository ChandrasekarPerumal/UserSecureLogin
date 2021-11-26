package com.chan.securelogin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chan.securelogin.service.HashingPassword;
import com.chan.securelogin.service.storeData;



@Controller
public class Securelogincontroller {
	
	
	@RequestMapping("home")
	public String home() {
	System.out.println("Its coming here");
		return "home";
	}
	
	@RequestMapping("login")
	public String loginpage() {
		return "login";
	}
	
	@RequestMapping("registerSuccess")
	public String registerData(@RequestParam("ename") String Name,@RequestParam("eid") String EmailId,@RequestParam("pwd") String Password ) {
		
		
		// Encrypt the password and store the data in DB;
		HashingPassword hp=new HashingPassword();
		String saltvalue=hp.getSaltvalue(30);
		String securedpassword=hp.generateSecurePassword(Password, saltvalue);
		
		storeData object2=new storeData(Name, EmailId, securedpassword,saltvalue);
		object2.connectDB();
		return "registerSuccess";
	}
	
	@RequestMapping("userValidate")
	public String userValidate(@RequestParam("eid") String email,@RequestParam("pwd") String pwd)
	{
		
		boolean flag=false;
		
		
		
		
		storeData sd= new storeData();
		
		
		flag=sd.ValidateUSer(email,pwd);
		
//		System.out.println("DB password: "+passwordtocheck);
//		
//		flag=securedpassword.equalsIgnoreCase(passwordtocheck);
//		
//		if(flag)
//			System.out.println("Password Matching");
//		else
//
//			System.out.println("Password Not Matching");
//			//return "userValidate";
		if(flag)
			return "userValidate";
		

	return "userValidateError";
	}
}
