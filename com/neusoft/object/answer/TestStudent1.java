package com.neusoft.object.answer;

import java.util.Arrays;

public class TestStudent1 {

	public static void main(String[] args) {
		Student1[] arr=new Student1[5];	
		arr[0]=new Student1(1, "С��", "��", 20, 90);
		arr[1]=new Student1(2, "С��", "Ů", 21, 100);
		arr[2]=new Student1(3, "С��", "��", 22, 90);
		arr[3]=new Student1(4, "С��", "Ů", 20, 80);
		arr[4]=new Student1(5, "С��", "Ů", 19, 80);
		int[] java=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].toString());
			java[i]=arr[i].getJava();
			sum+=java[i];
		}
		int av=sum/arr.length;
		Arrays.sort(java);
		System.out.println("Javaƽ��ֵΪ"+av);
		System.out.println("Java��߷�Ϊ"+java[java.length-1]);
		System.out.println("Java��ͷ�Ϊ"+java[0]);
		/*com.neusoft.java._200414object.Student1 stu1 = new com.neusoft.java._200414object.Student1(1, "С��", "��", 20, 90);
		System.out.println(stu1.toString());
		com.neusoft.java._200414object.Student1 stu2 = new com.neusoft.java._200414object.Student1(2, "С��", "Ů", 21, 100);
		System.out.println(stu2.toString());
		com.neusoft.java._200414object.Student1 stu3 = new com.neusoft.java._200414object.Student1(3, "С��", "��", 22, 90);
		System.out.println(stu3.toString());
		com.neusoft.java._200414object.Student1 stu4 = new com.neusoft.java._200414object.Student1(4, "С��", "Ů", 20, 80);
		System.out.println(stu4.toString());
		com.neusoft.java._200414object.Student1 stu5 = new com.neusoft.java._200414object.Student1(5, "С��", "Ů", 19, 80);
		System.out.println(stu5.toString());*/
		/*System.out.println("ѧ�ţ�"+stu1.sNO);
		System.out.println("������"+stu1.sName);
		System.out.println("�Ա�"+stu1.sSex);
		System.out.println("�Ա�"+stu1.sAge);
		System.out.println("Java�ɼ���"+stu1.sJava);*/		
	}

}
