package com.neusoft.base.answer;

public class Ex10 {

	public static void main(String[] args) {
		int i1 =10%-3;
		System.out.println("i1:"+i1);
		for(int i=0;i<=20;i++) {
			for(int j=0;j<=33;j++) {
				if(5*i+3*j+(100-i-j)/3==100) {
					//(100-i-j)/3����ֻȡ�������֣�
					//��Ǯ������ΪС��������С���ĸ���ֻ����3�ı���
					if((100-i-j)%3==0) {
				System.out.println("������"+i+" ĸ����"+j+" С����"+(100-i-j));
				}
			}
		}
	}
	}
}
