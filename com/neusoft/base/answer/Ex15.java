package com.neusoft.base.answer;

public class Ex15 {

	public static void main(String[] args) {
		/*double hight=100;
		double dstc=100;
		int i;
		for(i=1;i<=9;i++) {
			hight=hight/2;
			dstc=hight*2+dstc;
		}
		System.out.println("��"+i+"����ط���"+hight/2+"��");
		System.out.println("��"+i+"�����ʱ������"+dstc+"��");*/
		
		//�ȼ�����루�Ƽ���
		double hight=100;
		double dstc=0;
		for(int i=1;i<=10;i++) {
			if(i==1) {
				dstc=100;
			}else {
				dstc=hight*2+dstc;
			}
			hight=hight/2;
			System.out.println("��"+i+"����ط���"+hight+"��");
			System.out.println("��"+i+"�����ʱ������"+dstc+"��");
		}
		//�ȼ���߶�
/*		double hight=100;
		double dstc=0;
		for(int i=1;i<=10;i++) {
			hight=hight/2;
			if(i==1) {
				dstc=100;
			}else {
				dstc=hight*4+dstc;
			}		
			System.out.println("��"+i+"����ط���"+hight+"��");
			System.out.println("��"+i+"�����ʱ������"+dstc+"��");
		}*/
	}

}
