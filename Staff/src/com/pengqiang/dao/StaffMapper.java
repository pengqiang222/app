package com.pengqiang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.pengqiang.pojo.Staff;

@Repository("staffMapper")
public interface StaffMapper {
  
	
	List<Staff> find(@Param("pageno")Integer pageno,
			@Param("pagesize")Integer pagesize);
  
  
	int findTotal();
}
