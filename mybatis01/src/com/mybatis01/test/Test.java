package com.mybatis01.test;

import org.junit.Before;

import com.mybatis01.dao.DeptDao;
import com.mybatis01.pojo.Dept;

public class Test {
    private DeptDao dao;
	@Before
    public void init(){
    	dao = new DeptDao();
    }
	
	@org.junit.Test
	public void test() {
		//System.out.println(dao.findById(10));
		//System.out.println(dao.findAll());
		for(Dept dept:dao.findAll()){
			System.out.println(dept);
		}
	}
    @org.junit.Test
    public void testadd(){
    	//Dept dept = new Dept();
    	//dept.setDeptno(90);
    	//dept.setDname("œ˙ €≤ø");
    	//dept.setLoc("÷Í÷ﬁ2");
    	int id = 50;
    	int count = dao.delete(id);
    	System.out.println(count);
    	
    }
}
