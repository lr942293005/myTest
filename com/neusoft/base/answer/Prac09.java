/**
 * ʹ��ѭ����ӡ����ʥ������
               *
              ***
             *****
            *******
           *********
          ***********   
 */
package com.neusoft.base.answer;

public class Prac09 {

	public static void main(String[] args) {
		/*����˼·��
		1��˫��ѭ��
		2���߶ȣ�9
		3����ǰ�У�i
		3���ո�����   h<=5          ��ǰ�� h-i          i = 4 
		         h> 5         ��ǰ��     h-��10-i��         i = 6 ʱ��  �൱��  i = 4
		4����������  h <=5  2i-1        
		        h  >5   2(10-i) -1  --�� 20-2*i -1      
		
		*
		*/
		
		/*Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();*/
		//���ѭ�� ��1��ʼ��� һֱ���h�� i�Ǽ�¼��ǰ������
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for (int j = 0; j < 9 - i; j++) {
					System.out.print(" ");
					
				}
				for (int k = 0; k < 2*i-1; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			if(i > 5) {
				//��������ǿո�
				for (int j = 0; j < 9 - 10 + i; j++) {
					System.out.print(" ");
					
				}
				//����������ǻ�
				for (int k = 0; k < 20-2*i -1 ; k++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
			
		}
		
		
		
		
		
		

	}

}
