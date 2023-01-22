package com.deepcopy;

public class Employee {
	private int eid;
	private String ename;
	private String eusername;
	private Address address;

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

	public String getEusername() {
		return eusername;
	}

	public void setEusername(String eusername) {
		this.eusername = eusername;
	}

	public Employee(int eid, String ename, String eusername, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eusername = eusername;
		this.address = new Address(address.getState(),address.getCity(),address.getPincode());
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eusername=" + eusername + ", address=" + address + "]";
	}

}
