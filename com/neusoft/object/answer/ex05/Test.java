package com.neusoft.object.answer.ex05;

public class Test {

	public static void main(String[] args) {
		Employee.setCompany("huawei");
		Employee e1 = new Employee(2);
		//Employee.setCompany("huawei");//set��ʱ���ܹؼ����ڴ˴�set��˾����ʾhuawei
		System.out.println("for e1----name:"+e1.getName()+",age:"+e1.getAge()+",sex:"+e1.getSex()+
				",id:"+e1.getId()+",company:"+Employee.getCompany()+",salary:"+e1.getSalary());
		Employee e2 = new Employee("lisi", 20, "nan", 8000, 3, "xiaomi");//�вι��췽�����ѵ����޲ι��췽�������ٴ��޲ι��췽�����е�ֵ����������
		System.out.println("for e2----name:"+e2.getName()+",age:"+e2.getAge()+",sex:"+e2.getSex()+
				",id:"+e2.getId()+",company:"+Employee.getCompany()+",salary:"+e2.getSalary());
		e1.play();
		e1.sing();
	}

}
