package com.neusoft.$temp.fanxing.newWay;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Factory<Kele> factory1=new Factory<Kele>();//���ԶԴ������Ĳ�Ʒ��ʹͨ������ת��Ҳ��ƾ����ָ�������ͽ��м��
		Factory<Xuebi> factory2=new Factory<Xuebi>();//����ʱ���ͼ��
		factory1.<ZeroKele>jiamtc(new ZeroKele());
		//factory1.produce(new Xuebi());//�������Ͳ�һ��
		factory1.produce(new Kele());
		factory2.produce(new Xuebi());
		factory1.produce(new Kele());
		factory1.produce(new Kele());
		factory2.produce(new Xuebi());
		factory1.produce(new Kele());
		factory2.produce(new Xuebi());
		factory2.produce(new Xuebi());
		System.out.println(Arrays.toString(factory1.qishuis));//Arrays.toStringֻ�ܶ�����ʹ��
		System.out.println(Arrays.toString(factory2.qishuis));//��ӡ��qishuis�����е�ÿ��Ԫ�أ���ÿ��Ԫ�����Ƕ��󣬹�ֻ��Ծ���Ķ����Ӧ�������toString��������
	}

}
