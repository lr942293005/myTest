package com.neusoft.object.answer;

import java.util.Scanner;

public class PhoneBook {
	String name;
	String sex;
	int age;
	String phone;
	String qq;
	String address;
	static PhoneBook[] book = new PhoneBook[100];
	static int i = 0;// ��add������ָ�����һ�����ݣ��ڷ���������1���¼��ʵ�����С
	static Scanner sc = new Scanner(System.in);

	public PhoneBook(String name, String sex, int age, String phone, String qq, String address) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.qq = qq;
		this.address = address;
	}

	@Override
	public String toString() {
		return "������" + name + ", �Ա�" + sex + ", ���䣺" + age + ", �绰��" + phone + ", QQ��" + qq + ", ��ַ��" + address;
	}

	public static void main(String[] args) {
		while (true) {
			init();
			int get = sc.nextInt();
			sc.nextLine();
			if (get == 1) {
				add();
			} else if (get == 2) {
				delete();
			} else if (get == 3) {
				update();
			} else if (get == 4) {
				query();
			} else if (get == 5) {
				queryByCond();
			} else if (get == 0) {
				break;
			} else {
				System.out.println("��������");
			}
		}
	}

	public static void add() {
		System.out.println("----------��ӵ绰��----------");
		book[i] = inputInfo();
		System.out.println(book[i].toString());
		System.out.println("��ӳɹ���");
		i++;
	}

	public static void delete() {
		boolean flag1 = false;// ɾ��ʱ�Ƿ���ҵ������ı�־
		System.out.println("----------�h���绰��----------");
		System.out.print("������Ҫɾ����������");
		String name = sc.nextLine();
		for (int n = 0; n < i; n++) {
			if (book[n]!=null&&name.equals(book[n].name)) {
				flag1 = true;
				System.out.println(book[n].toString());
				System.out.println("ȷ��Ҫɾ����1���ǣ�0����");
				int isDelete = sc.nextInt();
				if (isDelete == 0) {
				} else if (isDelete == 1) {
					book[n]=null;
					System.out.println("�h���ɹ���");
				} else {
					System.out.println("��������");
				}
			}
		}
		if (flag1 == false) {
			System.out.println("����Ϣ��");
		}
	}

	public static void update() {
		boolean flag = false;// �޸�ʱ�Ƿ���ҵ������ı�־
		System.out.println("----------�޸ĵ绰��----------");
		System.out.print("������Ҫ�޸ĵ�������");
		String name = sc.nextLine();
		for (int n = 0; n < i; n++) {// �ַ����Ƚ����Ҫ��equals()
			if (book[n]!=null&&name.equals(book[n].name)) {
				flag = true;
				System.out.println(book[n].toString());
				System.out.println("������������Ϣ��");
				book[n] = inputInfo();
				System.out.println(book[n].toString());
				System.out.println("�޸ĳɹ���");
			}
		}
		if (flag == false) {
			System.out.println("����Ϣ��");
		}
	}

	public static void query() {
		System.out.println("----------��ӡ���е绰��----------");
		for (int n = 0; n < i; n++) {
			if (book[n] != null) {
				System.out.println(book[n].toString());
			}
		}
	}

	public static void queryByCond() {
		boolean flag2 = false;// ����������ѯ�Ƿ��ҵ������ı�־
		System.out.println("----------����������ѯ----------");
		System.out.print("������Ҫ��ѯ��������");
		String name = sc.nextLine();
		for (int n = 0; n < i; n++) {
			if (book[n] != null&&name.equals(book[n].name)) {
				flag2 = true;
				System.out.println(book[n].toString());
			}
		}
		if (flag2 == false) {
			System.out.println("����Ϣ��");
		}
	}

	public static void init() {
		System.out.println("------------�绰������ϵͳ-------------");
		System.out.println("1.���	2.ɾ��	3.�޸�	4.��ѯ����	5.����������ѯ	0.�˳�");
		System.out.println("------------�绰������ϵͳ-------------");
	}

	public static PhoneBook inputInfo() {
		System.out.print("������");
		String name = sc.nextLine();
		System.out.print("�Ա�");
		String sex = sc.nextLine();
		System.out.print("���䣺");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�绰��");
		String phone = sc.nextLine();
		System.out.print("QQ��");
		String qq = sc.nextLine();
		System.out.print("��ַ��");
		String address = sc.nextLine();
		PhoneBook pb = new PhoneBook(name, sex, age, phone, qq, address);
		return pb;
	}
}
