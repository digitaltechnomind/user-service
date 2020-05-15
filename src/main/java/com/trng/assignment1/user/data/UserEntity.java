package com.trng.assignment1.user.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity implements Serializable {

 
	private static final long serialVersionUID = -2731425678149216053L;
	
	@Id
	private long id;
	
	@Column(nullable=false, length=100)
	private String name;
	
	@Column(nullable=false)
	private int age;
	
	@Column(nullable=false, length=200)
	private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}