package com.xx.service;

import java.util.List;

import com.xx.entity.TAdmin;

public interface AdminService {

	public void add(TAdmin admin);
	public void delete(int id);
	public void update(TAdmin admin);
	public TAdmin load(int id);
	public List<TAdmin> list();
	public TAdmin login(String username, String password);
}
