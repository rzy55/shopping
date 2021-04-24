package com.xx.dao;

import java.util.List;

public interface BaseDao<T> {

	//����
	public int add(T t);
	
	//ɾ��
	public int delete(int id);
	
	//�޸�
	public int update(T t);
	
	//��ѯ����
	public List<T> getAll();
	
	//��ѯ����
	public T getOne();
	
}
