package com.cn.qgzx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.qgzx.dao.UserDao;
import com.cn.qgzx.entity.AcctUser;
import com.cn.qgzx.service.UserService;

/**
 * @author yanghong
 * @Date 2017年7月11日上午11:39:23
 * @Description 
 *
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public AcctUser load(String id) {
		// TODO Auto-generated method stub
		return userDao.load(id);
	}

	public AcctUser get(String id) {
		// TODO Auto-generated method stub
		return userDao.get(id);
	}

	public List<AcctUser> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	public void persist(AcctUser entity) {
		// TODO Auto-generated method stub
		userDao.persist(entity);
	}

	public String save(AcctUser entity) {
		// TODO Auto-generated method stub
		return userDao.save(entity);
	}

	public void saveOrUpdate(AcctUser entity) {
		// TODO Auto-generated method stub
		userDao.saveOrUpdate(entity);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

	public void flush() {
		// TODO Auto-generated method stub
		userDao.flush();
	}

}
