package com.cloneable;

public class Employee implements Cloneable{
	private int eid;
	private String ename;
	private String eusername;

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

	public Employee(int eid, String ename, String eusername) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eusername = eusername;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
