package com.luv2code.springdemo.dao;

/**
 * Dao Interface to handle all dao related activities
 * 
 * @author parikshit chauhan
 *
 */
public interface CounterDao {

	/**
	 * This method increases counter 
	 * @param count
	 */
	public void increaseCounter(int count);
	
	/**
	 * This method fetches count
	 * @return
	 */
	public int getCount();
}
