package com.neusoft.freqclass.prac;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: wwb
 */
public class ExCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //��Calendar����Ϊ����
        calendar.setTime(new Date());
        // ��ý����������
        int today = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("��\tһ\t��\t��\t��\t��\t��\t");

        // ��������Ϊ1
        calendar.set(Calendar.DATE, 1);
        //��ȡÿ��1�ŵ�������==�������ռ���
        //������-1 ����һ-2 ... ������-7 �ʼ�һ
        int a = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        while (a-- > 0) {
            System.out.print("\t");
        }

        int b = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        for (int i = 1; i <= calendar.getActualMaximum(Calendar.DATE); i++) {
            if (i == today)
                System.out.print("@" + i + "\t");
            else
                System.out.print(i + "\t");
            // ���Ͽյ���������7ʱ���У���if((i-(8-calendar.get(calendar.DAY_OF_WEEK)))%7==0)
            if ((i + b) % 7 == 0) {
                System.out.print("\n");
            }
        }

        /*//��ʽ2,�ѿճ������Ǽ���Ҳ����ѭ����
		for(int i=1;i<=(calendar.get(calendar.DAY_OF_WEEK)-1)+calendar.getActualMaximum(Calendar.DATE);i++) {
		if(i<=calendar.get(calendar.DAY_OF_WEEK)-1) {
		System.out.print("\t");
		continue;
		}
		System.out.print(i-(calendar.get(calendar.DAY_OF_WEEK)-1)+"\t");
		if(i%7==0) {
		System.out.print("\n");
		}
		}*/
    }
}
