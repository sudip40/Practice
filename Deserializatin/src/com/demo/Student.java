package com.demo;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private int sId;
	private String name;
	private String course;
	private int age;
	private String phone;
	private String address;
	private transient String password;
	private String username;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Student(int sId, String name, String course, int age, String phone, String address, String password,
			String username) {
		super();
		this.sId = sId;
		this.name = name;
		this.course = course;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.password = password;
		this.username = username;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", course=" + course + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + ", password=" + password + ", username=" + username + "]";
	}

}
