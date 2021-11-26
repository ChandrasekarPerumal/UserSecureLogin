package com.chan.securelogin.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class userdatalogin {
	
	
	private String name;
	
	@Id
	private String eid; //Primary key 
	private String password;
	private String salt;
	public userdatalogin() {
		
	}
	
	public userdatalogin(String name, String eid, String password,String salt) {
		
		this.name = name;
		this.eid = eid;
		this.password = password;
		this.salt=salt;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	@Override
	public String toString() {
		return "userdata [name=" + name + ", eid=" + eid + ", password=" + password + ", salt=" + salt + "]";
	} 
	
	
	
	
	
	
}
