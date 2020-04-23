package com.neusoft.$temp.base.innerclass;

public class InnerClassTest4 {
	//�����ڲ��࣬ͨ���̳У��ɾ�����д��ʹ�ø��෽�����������½��࣬�����������ͷ��ͣ�ֻ�����������ĸ�����������ͺͻ����ţ���������
	public static void main(String[] args) {
		//1.������д�˼̳��ڸ����test������new User() {��д�ķ���...}����ʽ���൱����1������
		new User() {
		@Override
		public void test() {
			System.out.println("you are test...");
		}
		}.test();
		
		//2.ͬ1������������ת�ͳ���User��������Ϊuser1��user1����������Ǹ����ʵ������
		User user1=new User() {
			@Override
			public void test() {
				System.out.println("you are test...");
			}
		};
		user1.test();
		
		
		//3.��������˼̳��ڸ����test������new User() {}����ʽ���൱����1������
		new User() {}.test();
		
		//4.ͬ3������������ת�ͳ���User��������Ϊuser
		User user=new User() {};
		user.test();
	}

}

class User{
	public void test() {
		System.out.println("I`m test...");
	}
}