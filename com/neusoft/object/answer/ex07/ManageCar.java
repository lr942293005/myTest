package com.neusoft.object.answer.ex07;

public class ManageCar {
	Car[] car = new Car[100];
	
	void add(Car c) {
		if(c==null) {
			System.out.println("������������");
		}else {
		for(int i=0;i<car.length;i++) {
			if(car[i]==null) {
			car[i]=c;
			System.out.println("�������ݳɹ���");
			System.out.println(car[i].toString());
			break;
			}
		}
		}
	}
	void delete(String id) {
		boolean flag = false;
		for(int i=0;i<car.length;i++) {
			if(car[i]!=null&&car[i].id.equals(id)) {
				flag = true;
			System.out.println(car[i].toString());
			car[i]=null;
			break;
			}
		}
		if (flag == false) {
			System.out.println("����Ϣ��");
		}
	}
	void update(String id) {
		boolean flag1 = false;// �޸�ʱ�Ƿ���ҵ���ŵı�־
		for (int i = 0; i < car.length; i++) {// �ַ����Ƚ����Ҫ��equals()
			if (car[i]!=null&&id.equals(car[i].id)) {
				flag1 = true;
				System.out.println(car[i].toString());
				System.out.println("������������Ϣ��");
				car[i] = Test.inputInfo();//ʵ�������е��þ�̬����
				System.out.println(car[i].toString());
				System.out.println("�޸ĳɹ���");
				break;
			}
		}
		if (flag1 == false) {
			System.out.println("����Ϣ��");
		}
	}
	void query(String id) {
		boolean flag2=false;
		for(int i=0;i<car.length;i++) {
			if(car[i]!=null&&car[i].id.equals(id)) {
			flag2 = true;
			System.out.println(car[i].toString());
			break;
			}
		}
		if (flag2 == false) {
			System.out.println("����Ϣ��");
		}
	}
	void queryAll() {
		for(int i=0;i<car.length;i++) {
			if(car[i]!=null) {
			System.out.println(car[i].toString());
			}
		}
	}
}
