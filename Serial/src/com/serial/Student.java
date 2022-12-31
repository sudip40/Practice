package com.serial;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	private int role;
	private String name;
	private int marks;
	private String username;
	private transient String password;
	public static int id = 1;

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Student(int role, String name, int marks, String username, String password) {
		super();
		this.role = role;
		this.name = name;
		this.marks = marks;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [role=" + role + ", name=" + name + ", marks=" + marks + ", username=" + username
				+ ", password=" + password + "]";
	}

	

	
}
