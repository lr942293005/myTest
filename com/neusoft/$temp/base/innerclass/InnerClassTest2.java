package com.neusoft.$temp.base.innerclass;

public class InnerClassTest2 {
	//��̬�ڲ���
	public static void main(String[] args) {
		//Small small=new Small();//С�౻����Ϊ��̬�����ֱ�����������е���
		Small small=new Small();//��ԣ�����.С�ࣩ����ʵ����
		/*InnerClassTest2 innerClassTest2=new InnerClassTest2();//����Ա�ڲ���Ĵ�������������
		InnerClassTest2.Small small=innerClassTest2.new Small();*/
		small.samll();
	}
	
	public static class Small{
		public void samll() {
			System.out.println("I`m smaller");
		}
	}
}
