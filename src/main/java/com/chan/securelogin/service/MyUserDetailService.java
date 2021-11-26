//package com.chan.securelogin.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.chan.securelogin.UserRepository;
//import com.chan.securelogin.model.userdata;
//
//public class MyUserDetailService implements UserDetailsService {
//	
//	@Autowired
//	private UserRepository repo;
//	
//	
//	public UserDetails loadUserByUsname(String username)throws UsernameNotFoundException{
//		userdata user=repo.findByUserName(username);
//		return null;
//	}
//
//}
