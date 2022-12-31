package com.hashset;
import java.util.Objects;

public class Employee{
	private int eid;
	private String name;
	private int salary;

	public Employee(int eid, String name, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid);
	}

	@Override
	public boolean equals(Object obj) {
		Employee e1=(Employee) obj;
		if(this.eid==e1.eid) {
			return true;
        }
		else {
			return false;
		}
	}
    
}
