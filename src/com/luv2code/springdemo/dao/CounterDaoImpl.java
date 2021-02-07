package com.luv2code.springdemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.CountEntity;

/**
 * class contains all dao related methods
 * @author parikshit chauhan
 *
 */
@Repository
public class CounterDaoImpl implements CounterDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * This method inserts new count value in db
	 */
	@Override
	@Transactional
	public void increaseCounter(int count) {
		Session session=sessionFactory.getCurrentSession();
		CountEntity countEntity=new CountEntity(); 
		countEntity.setCount(count);
		session.saveOrUpdate(countEntity);
		
	}

	/**
	 * This method fetches count from db
	 */
	@Override
	@Transactional
	public int getCount() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("Select max(c.count) FROM CountEntity c");
		return (int) query.list().get(0);
		
	}

}
