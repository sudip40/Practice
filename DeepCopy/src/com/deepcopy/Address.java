package com.deepcopy;

public class Address {
	private String state;
	private String city;
	private String pincode;

	public Address(String state, String city, String pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public String getPincode() {
		return pincode;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
