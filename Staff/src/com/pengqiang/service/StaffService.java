package com.pengqiang.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pengqiang.dao.StaffMapper;
import com.pengqiang.pojo.Staff;

@Service("staffService")
public class StaffService {
	@Resource(name="staffMapper")
	private StaffMapper staffMapper;
	
	public List<Staff> find(Integer pageno,Integer pagesize){
		return staffMapper.find(pageno, pagesize);
	}
	public int findTotal(){
		return staffMapper.findTotal();
	}
}
