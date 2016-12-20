package com.pengqiang.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pengqiang.pojo.Staff;
import com.pengqiang.service.StaffService;
import com.pengqiang.util.Pager;

@Controller
public class StaffController {
    @Resource(name="staffService")
	private StaffService staffService;
    
    @RequestMapping("staffController_list")
    public ModelAndView find(@RequestParam(value="page",required=true)Integer page,
			@RequestParam(value="rows",required=true)Integer rows){
    	Integer pageno = (page -1) * rows;
    	Integer pagesize = page * rows;
    	Pager<Staff> pager = new Pager<Staff>();
    	ModelAndView modelAndView = new ModelAndView("stafflist");
    	pager.setTotal(staffService.findTotal());
    	pager.setRows(staffService.find(pageno, pagesize));
    	modelAndView.addObject("staffs", pager.getRows());
    	modelAndView.addObject("total", pager.getTotal());
    	modelAndView.addObject("page", page);
    	return modelAndView;
    	
    }
}
