package com.neusoft.freqclass.answer;

import java.util.Scanner;

public class Ex07 {
	static String name;
	static String psw;
	static String name2;
	static String cName;
	static String tel;
	static String mail;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		System.out.println("�������û���(10λ����Ӣ�Ļ�����)��");
		name=sc.nextLine();
		boolean flag=test(name);
		if(flag) {
			break;
			}
		}
		System.out.println("����������(10λ����Ӣ�Ļ�����)��");
		psw=sc.nextLine();
		test(psw);
		StringBuffer bf=new StringBuffer(psw);
		bf.append("a2b13");
		bf.insert(3, "hahah");
		bf.setCharAt(2, 'c');
		bf.reverse();
		psw=bf.toString();
		System.out.println("�������ǳ�(10λ����Ӣ�Ļ�����)��");
		name2=sc.nextLine();
		test(name2);
		System.out.println("�������������֣�");
		cName=sc.nextLine();
		String cNameTest= "^[\u4e00-\u9fa5]+$";
		if(cName.matches(cNameTest)) {
			System.out.println(cName);
			}else {
				System.out.println("��������");
		}
		System.out.println("�������ֻ��ţ�");
		tel=sc.nextLine();
		String telTest= "^[1][0-9]{10}$";
		if(tel.matches(telTest)) {
			System.out.println(tel);
			}else {
				System.out.println("��������");
		}
		System.out.println("���������䣺");
		mail=sc.nextLine();
		String mailTest= "^[a-zA-Z0-9][a-zA-Z0-9_-]*@([a-zA-Z0-9_-]+\\.)+(com|gov|net|com\\.cn|edu\\.cn)$";
		if(mail.matches(mailTest)) {
			System.out.println(mail);
			}else {
				System.out.println("��������");
		}
		System.out.println("----����ע����Ϣ---");
		System.out.println("�û�����"+name+",���루���ܺ󣩣�"+psw+",�ǳƣ�"+name2+",��������"+cName+",�ֻ���"+tel+",���䣺"+mail);
	}
	public static boolean test(String str) {
		String nameTest= "^[a-zA-Z0-9\u4e00-\u9fa5]{1,10}$";
		if(!str.matches(nameTest)) {
				System.out.println("��������");
		}
		return str.matches(nameTest);
	}
}
