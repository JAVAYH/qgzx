package com.cn.qgzx.service;

import java.util.List;

import com.cn.qgzx.entity.AcctUser;

/**
 * @author yanghong
 * @Date 2017年7月11日上午11:36:32
 * @Description 
 *
 */
public interface UserService {
	
	public AcctUser load(String id);

	public AcctUser get(String id);

	public List<AcctUser> findAll();

	public void persist(AcctUser entity);

	public String save(AcctUser entity);

	public void saveOrUpdate(AcctUser entity);

	public void delete(String id);

	public void flush();
}
