package com.cg;

import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.pms.Service.UserdetailsService;
import com.cg.pms.dao.UserdetailsDao;
import com.cg.pms.entity.Userdetails;
import com.cg.pms.exception.UserdetailsException;

@SpringBootTest
class GreatoutApplicationTests {

	@Autowired
	private UserdetailsService userdetailsService;
	
	@MockBean
	private UserdetailsDao userdetailsdao;
	
	
	@Test
	void contextLoads() throws UserdetailsException
	{
		
	}

	//@Test 
//	public void getUserdetails() throws UserdetailsException
//	{
//	 when(userdetailsdao.findAll()).thenReturn(Stream.of(new Userdetails("Navya12","Bvrit@12","12334555","navya@gmail.com","Admin",0),("Shree12","Bvrit@1234","1267878","shree@gmail.com","user","0")).collect(Collectors.toList()));
//	 assertEquals(1,userdetailsService.findAllUserdetails().size());
//	}
	
}