package com.chan.securelogin.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chan.securelogin.model.userdatalogin;

public class storeData {

	//Store Data to DB
	// Connection to DB
	private String name;
	private String eid;
	private String pwd;
	private String saltV;
	
	public storeData() {
		
	}
	
	public storeData(String name,String eid,String password,String salt){
	
		this.name=name;
		this.eid=eid;
		this.pwd=password;
		this.saltV=salt;
	}
	
	public void connectDB() {
	//Class object
	userdatalogin obj1=new userdatalogin(name,eid,pwd,saltV);	
	//System.out.println("Solution:"+name+":"+eid+":"+pwd);
	
	Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(userdatalogin.class);
	
	SessionFactory sf=con.buildSessionFactory();
	
	Session sess=sf.openSession();
		
	Transaction tx=sess.beginTransaction();
	
	sess.save(obj1);//Store data
	
	tx.commit();
	
	sess.close();
	}
	
	
	public boolean ValidateUSer(String eid ,String OldPassword )
	{
		boolean flag=false;
		userdatalogin user=new userdatalogin();	
	
		HashingPassword hp=new HashingPassword();
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(userdatalogin.class);
		SessionFactory sf=con.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		
		user=sess.get(userdatalogin.class,eid);
		
		//String checkEmail=user.getEid();
		String checkPass=user.getPassword();
		String checkSalt=user.getSalt();
		
		String newPass=hp.generateSecurePassword(OldPassword, checkSalt);
		flag=newPass.equalsIgnoreCase(checkPass);
		if(flag)
			return flag;
		
		tx.commit();
		
		sess.close();
		
		return flag;
	}
	
}
