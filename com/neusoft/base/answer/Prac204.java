/**
 * 4.һ�����100�׸߶����£�ÿ����غ�����ԭ�߶ȵ�һ�룬�����£������ڵ�10�����ʱ�����������ף���10�η�����ߣ�
 * 
 * 100   
 *      50   
 *          25
 *               12
 *                    6
 *100                      
 *      h = ǰһ��h/2              
 *      100  + h*2
 * 
 */
package com.neusoft.base.answer;

public class Prac204 {

	public static void main(String[] args) {
		double hight = 100; //��¼��ǰ�߶�
		double totalHight = 0; //��¼�ܵ�·��
		//ÿ��ѭ�� �߶ȼ��롣
		/*for (int i = 1; i <= 10; i++) {
			hight = hight/2;
			System.out.println("��" + i + "�����ĸ߶���" + hight);
			if(i == 1) {
				totalHight = 100;
			}else {
				totalHight +=  hight * 4 ;
			}
			
			System.out.println("��" + i + "����������ľ�����" + totalHight);
			//�������  ���շ�  ������    //����ĸ��д  ֮���շ� 
			
		}*/
		for (int i = 1; i <= 10; i++) {
			//hight = hight/2;
			if(i == 1) {
				totalHight = 100;
			}else {
				totalHight +=  hight * 2 ;
			}
			hight = hight/2;
			
			System.out.println("��" + i + "�����ĸ߶���" + hight);
			
			System.out.println("��" + i + "����������ľ�����" + totalHight);
			//�������  ���շ�  ������    //����ĸ��д  ֮���շ� 
			
		}
		
	}

	
	
	
	
	
	
	
	
	
}
