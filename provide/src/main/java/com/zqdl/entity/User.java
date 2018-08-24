package com.zqdl.entity;

import java.io.Serializable;

public class User implements Serializable{
	/**   
	 * @author: GuanJunHui 
	 * @date:  2018年8月24日 上午11:36:25   
	 * @version V1.0 
	 * @Copyright: 2018   
	 */
	private static final long serialVersionUID = 2529419775810024381L;
	private String id;
	private String name;
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
