package com.neusoft.array.answer;

public class Ex02 {

	public static void main(String[] args) {
		//�����0���ĸ�����Ϊ�����鳤��
		int num=0;
		int[] old={3,7,16,0,5,0,0,6,7,0,5};
		for(int i=0;i<old.length;i++) {
			if(old[i]!=0) {
				num+=1;
			}
		}
		//�����о���ֵ�Ļ���Ҳ������Ϊ���鳤��
		int[] young=new int[num];
		//��Ҫһ����0��ʼ���ϼ�1��ֵ��ʾ��������±�
		int j=0;
		//������������������
		for(int i=0;i<old.length;i++) {
				if(old[i]!=0) {
						young[j]=old[i];
						j++;
				}
			}
		System.out.print("ȥ��0����������ǣ�");
		for(int m=0;m<young.length;m++) {		
		System.out.print(young[m]+" ");
		}
	}

}
