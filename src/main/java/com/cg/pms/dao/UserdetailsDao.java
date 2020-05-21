package com.cg.pms.dao;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.pms.entity.Userdetails;

@Repository
	public interface UserdetailsDao extends JpaRepository<Userdetails,Integer>{
	
@Query(" select e from Userdetails e where e.user_Name=:user and e.password=:pass")
	public Userdetails findUser(@Param("user") String user,@Param("pass") String pass);	

@Query("select e from Userdetails e where e.user_Name=:user")
public Userdetails logout(@Param("user") String user);

}
