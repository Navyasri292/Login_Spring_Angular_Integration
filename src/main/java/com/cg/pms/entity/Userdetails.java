package com.cg.pms.entity;

import javax.persistence.Column;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="userdetails_tbl")
  public class Userdetails {
    
    @Id
	@Column(name="user_Name",length=20)
	private String  user_Name;
	
	@Column(name="password",length=20)
	private String password;
		
	@Column(name="phonenum",length=20)
	private String phoneNum;
	
	@Column(name="emailid",length=20)
	private String emailId;
	
	@Column(name="role",length=20)
	private String role;
	
	@Column(name="status")
	private int status;
	


	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	

}
