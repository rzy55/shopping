package com.xx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xx.entity.TAdmin;
import com.xx.entity.TAdminExample;
import com.xx.entity.TAdminExample.Criteria;
import com.xx.mapper.TAdminMapper;
import com.xx.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private TAdminMapper adminMapper;
	
	@Override
	public void add(TAdmin admin) {
		adminMapper.insert(admin);

	}

	@Override
	public void delete(int id) {
		adminMapper.deleteByPrimaryKey(id);

	}

	@Transactional
	public void update(TAdmin admin) {
		TAdminExample example = new TAdminExample();
        Criteria createCriteria = example.createCriteria();
        createCriteria.andAdminIdEqualTo(admin.getAdminId());
        adminMapper.updateByExampleSelective(admin, example );

	}

	@Override
	public TAdmin load(int id) {
		TAdmin tAdmin = adminMapper.selectByPrimaryKey(id);
        return tAdmin;
	}

	@Override
	public List<TAdmin> list() {
		List<TAdmin> list = adminMapper.selectByExample(null);
        return list;
	}

	@Override
	public TAdmin login(String username, String password) {
		TAdminExample example = new TAdminExample();
        Criteria createCriteria = example.createCriteria();
        createCriteria.andAdminUsernameEqualTo(username);
        createCriteria.andAdminPasswordEqualTo(password);
        List<TAdmin> admin = adminMapper.selectByExample(example);
        return admin.get(0);
	}

}
