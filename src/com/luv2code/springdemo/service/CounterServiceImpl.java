package com.luv2code.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.CounterDao;
/**
 * Service class for processing of count
 * @author parikshit chauhan
 *
 */
@Service
public class CounterServiceImpl{
	
	@Autowired
	CounterDao counterDao;
	
	/**
	 * This method fetchec count and increase its value by 1
	 */
	public synchronized void getAndIncreaseCount() {
		int count=counterDao.getCount();
		count++;
		counterDao.increaseCounter(count);		
	}

}
