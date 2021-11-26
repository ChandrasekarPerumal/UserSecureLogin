//package com.chan.securelogin;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//
//@Configuration
//@EnableWebSecurity
//public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private UserDetailsService uds;
//	
//	
//	public AuthenticationProvider authProvider() {
//		
//		//Data access object
//		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
//		 
//		provider.setUserDetailsService(uds);
//		provider.setPasswordEncoder();
//		
//		return provider;
//	}
//	
//	
//}
