package com.cg.pms.Service;

import java.util.List;

import com.cg.pms.entity.Userdetails;
import com.cg.pms.exception.UserdetailsException;

public interface UserdetailsService {
	
	public Userdetails addUserdetails(Userdetails userdetails);
	 public List<Userdetails> findAllUserdetails(); 
	 public Userdetails findUser(String User_name,String Password) throws UserdetailsException;
	 //public Userdetails updateStatus(Userdetails userdetails, int status);
	 public Userdetails logout(String user_Name);
		// public List<Userdetails>  findByDesignation(String designation);
	
}
