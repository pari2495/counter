package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class to be mapped to db
 * @author parikshit chauhan
 *
 */
@Entity
@Table(name = "thread_counter")
public class CountEntity {

	@Id
	@Column(name = "count")
	private int count;

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "CountEntity [count=" + count + "]";
	}
	
	
}
