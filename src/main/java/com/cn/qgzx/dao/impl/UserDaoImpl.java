package com.cn.qgzx.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cn.qgzx.dao.UserDao;
import com.cn.qgzx.entity.AcctUser;
@Repository("userDao")
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return this.sessionFactory.getCurrentSession();
	}

	public AcctUser load(String id) {
		// TODO Auto-generated method stub
		return (AcctUser) this.sessionFactory.getCurrentSession().load(AcctUser.class, id);
	}

	public AcctUser get(String id) {
		// TODO Auto-generated method stub
		return (AcctUser) this.getCurrentSession().get(AcctUser.class, id);
	}

	public List<AcctUser> findAll() {
		@SuppressWarnings("unchecked")
		List<AcctUser> accUsers=this.getCurrentSession().createCriteria("from AccUser").setCacheable(true).list();
		return accUsers;
	}

	public void persist(AcctUser entity) {
		this.getCurrentSession().persist(entity);
		
	}

	public String save(AcctUser entity) {
		System.out.println("session+++++++++");
		System.out.println(this.getCurrentSession()+"+session");
		return (String) this.getCurrentSession().save(entity);
	}

	public void saveOrUpdate(AcctUser entity) {
		// TODO Auto-generated method stub
		this.getCurrentSession().saveOrUpdate(entity);
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		AcctUser entity=this.load(id);
		this.getCurrentSession().delete(entity);
	}

	public void flush() {
		this.getCurrentSession().flush();
	}
	

}
