package com.xx.dao;

import java.util.List;

public interface BaseDao<T> {

	//增加
	public int add(T t);
	
	//删除
	public int delete(int id);
	
	//修改
	public int update(T t);
	
	//查询所有
	public List<T> getAll();
	
	//查询单个
	public T getOne();
	
}
