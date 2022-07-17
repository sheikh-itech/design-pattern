package com.general.design.creational.prototype;

/**
 *	It says- Cloning of an existing object instead of creating new one
 *	And can also be customized as per the requirement
 *
 *	Use this approach if cost of creating a new object is expensive and resource intensive
 *
 *	It hides complexities of creating objects
 *	
 *	NOTE: Without Interface Also Possible
 */

public class PrototypeDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Hapheej", "Narsinghpur", 975380617, "dummy", "IT Product");
		Employee e2 = (Employee) e1.getPrototype();
		Employee e3 = (Employee) e1.getPrototype();
		Employee e4 = (Employee) e2.getPrototype();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		System.out.println();
		
		Student s1 = new Student(501, 98562187, "Arham", "Narsinghpur");
		Student s2 = (Student) s1.getPrototype();
		Student s3 = (Student) s2.getPrototype();
		Student s4 = (Student) s3.getPrototype();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
