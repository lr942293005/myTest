package com.neusoft.$temp.base.innerclass;

public class InnerClassTest3 {
	//�ֲ��ڲ���(�����ڲ���)
	public static void main(String[] args) {
		InnerClassTest3 innerClassTest3=new InnerClassTest3();//��ͨ�Ĵ�������ͷ�������
		innerClassTest3.test();
	}
	
	public void test() {
		class Small{//�ֲ��ڲ����ﲻ�ܼ�public
			public void samll() {
				System.out.println("I`m small...");
			}
		}
		Small small=new Small();//ֻ���ڷ��������ã��ڷ����ﶨ����������ʵ�����͵���
		small.samll();
	}
			
}
