package com.pengqiang.util;

import java.util.List;

public class Pager<T> {
	//easyui 约定的变量
     private int total;   //分页总记录数
     private List<T> rows; //分页数据
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
     
     
	
}
