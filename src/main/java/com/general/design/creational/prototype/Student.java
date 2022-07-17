package com.general.design.creational.prototype;

public class Student implements Prototype {

	private int id;
	private long number;
	private String name;
	private String address;
	
	//static to remove duplicate from consecutive two object prototype
	private static int tempId;
	
	Student(int id, long number, String name, String address) {
		this.id = id;
		Student.tempId = id;
		this.number = number;
		this.name = name;
		this.address = address;
	}
	
	public Prototype getPrototype() {

		return new Student(++Student.tempId, this.number, this.name, this.address);
	}
	
	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student{id=" + id + ", number=" + number + ", name=" + name + ", address=" + address + "}";
	}
}
