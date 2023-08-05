package com.info.project1;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String CompanyName;
	
	public Employee(int id, String name, int age, String companyName) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		CompanyName = companyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	@Override
	public String toString() {
		return " Employee id = " + id + "\n name = " + name + "\n age = " + age + "\n CompanyName = " + CompanyName;
	}
	
	
	
}
