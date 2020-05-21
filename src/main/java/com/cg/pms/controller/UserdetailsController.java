package com.cg.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pms.Service.UserdetailsService;
import com.cg.pms.entity.Userdetails;
import com.cg.pms.exception.UserdetailsException;

@RestController
@CrossOrigin("*")
public class UserdetailsController {
	@Autowired
    UserdetailsService loginService;
	
	@PostMapping("userdetails")
	public ResponseEntity<Userdetails>  createUserdetails(@RequestBody Userdetails userdetails)
	{
		Userdetails user = loginService.addUserdetails(userdetails);
		   ResponseEntity<Userdetails> rt= new ResponseEntity<Userdetails>(userdetails,HttpStatus.OK);
		   return rt;
   }

	
	@GetMapping ("user/login/{User_Name}/{password}")
	public ResponseEntity<Userdetails> login(@PathVariable("User_Name") String User_Name,@PathVariable("password") String password) throws UserdetailsException
	
	{
		Userdetails userinfo=loginService.findUser(User_Name,password);
		ResponseEntity<Userdetails> re=new ResponseEntity<Userdetails>(userinfo,HttpStatus.OK);
		int s=userinfo.getStatus();
	
		return re;
	
		
				
	}
	
	
	@GetMapping("userdetails")
	public ResponseEntity<List<Userdetails>>  findAllUserdetails()
	{
	  
		List<Userdetails> list = loginService.findAllUserdetails();
		ResponseEntity<List<Userdetails>>  rt = new ResponseEntity<List<Userdetails>>(list,HttpStatus.OK);
		return rt;
		
	}
	
//	@PutMapping("logout/{status}")

//	public  ResponseEntity<Userdetails>  updatestatus(@RequestBody Userdetails userdetails) throws  Exception
//	{
//		ResponseEntity<Userdetails>  rt = null;
//		
//		if(userdetails!=null)
//		{
//			userdetails = loginService.updatestatus(userdetails);
//			rt= new ResponseEntity<Userdetails>(userdetails,HttpStatus.OK);
//		}
//		else
//		{
//			rt=new ResponseEntity<Userdetails>(HttpStatus.NOT_FOUND);
//		}
//     return rt;
//		
	//}
	
	@PutMapping("logout/{user_Name}")
	public String  logout(@PathVariable("user_Name") String user_Name) 
	{
	//userdetails.setStatus(status);
	Userdetails s=loginService.logout(user_Name);
//	int st=s.getStatus();
//	System.out.print(st);
//	if(st==1)
//	{
//		s.setStatus(0);
//	}
	
	return s.getUser_Name() +" status= "+ s.getStatus();
	}
}



