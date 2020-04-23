package com.neusoft.object.answer.ex05;

public class Employee extends Role {
	private final int id=1;
	private static String company;
	private int salary;
	
	public Employee(int id) {//idΪ��������ֵ�ǰ״�
		super();
		company="meizu";
		salary=7000;
	}
	
	public Employee(String name, int age, String sex,int salary,int id,String company) {
		super(name, age, sex);
		this.salary = salary;
		Employee.company=company;
	}
	
	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void play() {
		System.out.println("belong to Employee.play()");
		say();//����������ֱ�ӵ��ø���ķ���
	}

}
