package com.neusoft.$temp.fanxing.oldWay;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Factory factory=new Factory();//�����ù���ֻ����ĳһ��Ʒ����������ת���޷����
		factory.produce(new Kele());
		factory.produce(new Xuebi());
		factory.produce(new Kele());
		factory.produce(new Kele());
		factory.produce(new Xuebi());
		factory.produce(new Kele());
		factory.produce(new Xuebi());
		factory.produce(new Xuebi());
		System.out.println(Arrays.toString(factory.qishuis));
	}

}
