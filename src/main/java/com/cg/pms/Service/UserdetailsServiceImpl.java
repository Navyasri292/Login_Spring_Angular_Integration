package com.cg.pms.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pms.dao.UserdetailsDao;
import com.cg.pms.entity.Userdetails;
import com.cg.pms.exception.UserdetailsException;

@Service
public class UserdetailsServiceImpl implements UserdetailsService {

	  @Autowired
	    UserdetailsDao userdetailsdao;
	    
	  
		@Override
		public Userdetails addUserdetails(Userdetails userdetails) {
			userdetailsdao.saveAndFlush(userdetails);
			return userdetails;
		}


		@Override
		public List<Userdetails> findAllUserdetails() {
			List<Userdetails> list = userdetailsdao.findAll();
			return list;
		}


//		@Override
//		public List<Userdetails> findByDesignation(String designation) {
//			
//			return userdetailsdao.findByDesignation(designation);
//		}


		@Override
		public Userdetails findUser(String User_name, String Password) throws UserdetailsException{
        Userdetails user =null;
        System.out.println(User_name);
        System.out.println(Password);
       
            user =userdetailsdao.findUser(User_name,Password);
            if(user==null)
            {
            	throw new UserdetailsException("User not registerd");
            }
            
            else
            {
            	user.setStatus(1);
            	userdetailsdao.saveAndFlush(user);
            	return user;
         }
		}

 @Override
 public Userdetails logout(String user_Name) {
 
Userdetails ud =userdetailsdao.logout(user_Name);
ud.setStatus(0);
userdetailsdao.saveAndFlush(ud);

	return ud;
}


//		@Override
//		public Userdetails updatestatus(Userdetails userdetails) throws UserdetailsException {
//			int status = userdetails.getStatus();
//			if( userdetailsdao.existsById(status))
//			{
//				Userdetails userdetails1 = userdetailsdao.findById(status).get();
//			
//				userdetailsdao.saveAndFlush(userdetails);
//			}
//			else
//			{
//				throw new UserdetailsException("not logged out");
//			}
//			return userdetails;
//		}

		

}
