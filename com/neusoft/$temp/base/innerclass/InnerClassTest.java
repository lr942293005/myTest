package com.neusoft.$temp.base.innerclass;

public class InnerClassTest {
	public static void main(String[] args){
		//��Ա�ڲ���
		/*InnerClassTest innerClassTest=new InnerClassTest();//�ȴ����������
		InnerClassTest.Small small=innerClassTest.new Small();//��ͨ���������ȥ����С�࣬С�������Ҫ�����ڴ���֮��*/		
		Small small=new InnerClassTest().new Small();//��new�����newС�࣬����Ϊ(����.С��)
		small.samll();//С��������С�෽��
	}
	public class Small{
		public void samll() {
			System.out.println("I`m small");
		}
	}
}
