package com.general.design.creational.prototype;


public class Employee implements Prototype {

	private int id;
	private String name;
	private String address;
	private long number;
	private String companyName;
	private String companyType;
	
	//static to remove duplicate from consecutive two object prototype
	private static int tempId;
	
	public Employee(int id, String name, String address, long number, String companyName, String companyType) {
		
		this.id = id;
		Employee.tempId = id;
		this.name= name;
		this.address = address;
		this.number = number;
		this.companyName = companyName;
		this.companyType = companyType;
	}
	
	public Prototype getPrototype() {
		
		return new Employee(++Employee.tempId, this.name, this.address, this.number, this.companyName, this.companyType);
	}
	
	public void updateAddress(String address) {
		this.address = address;
	}
	
	public void updateNumber(long number) {
		this.number = number;
	}

	public void updateName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Emp {id=" + id + ", name=" + name + ", address=" + address + ", companyName=" + companyName
				+ ", companyType=" + companyType + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
