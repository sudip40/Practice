package com.comparable;

public class Employee implements Comparable<Employee>{
	private int eid;
	private String name;
	private int salary;

	public Employee(int eid, String name, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.eid==o.eid) {
			return 0;
		}
		else if(this.eid>o.eid) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
