package com.neusoft.array.answer;

public class Ex01 {

	public static void main(String[] args) {
		int[] a= {1,2,3,1,0};
		int temp=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			//�ҳ�1���ظ���,��־λһ�ı�Ϳ�������
			if(flag==true) {
				break;
			}
			temp=a[i];
			//ÿ��Ԫ��ֻ���Լ�֮������Ƚϼ���
			for(int j=i+1;j<a.length;j++) {
				if(temp==a[j]) {
					flag=true;
					break;
					}
			}
		}
		if(flag==true) {
		System.out.println("�ҵ��ĵ�һ���ظ�Ԫ����"+temp);
		}else {
		System.out.println("û���ظ�Ԫ�أ�");
		}
	}

}
