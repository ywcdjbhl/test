package com.you.test;

public class Test73 {
	String[] address;
	public String[] getAddress() {
		return address;
	}

	public void setAddress(String[] address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return this.address[0] + this.address[1];
	}
}
