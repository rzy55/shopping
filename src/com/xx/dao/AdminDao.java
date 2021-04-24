package com.xx.dao;

import com.xx.entity.TAdmin;

public interface AdminDao extends BaseDao<TAdmin>{

	public TAdmin login(int adminId,String adminUsername);
}
