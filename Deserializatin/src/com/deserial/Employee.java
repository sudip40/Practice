package com.deserial;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private int eid;
	private String ename;
	private int salary;
	private transient String password;
	private String username;

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

	public Employee(int eid, String ename, int salary, String password, String username) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.password = password;
		this.username = username;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

}
