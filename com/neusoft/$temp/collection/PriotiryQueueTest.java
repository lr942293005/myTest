package com.neusoft.$temp.collection;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriotiryQueueTest {

	public static void main(String[] args) {
		PriorityQueue priorityQueue=new PriorityQueue(5,new myComparator2());//5Ϊ��ʼ����,����������
		priorityQueue.add(new Person("zhangsan",(short)18,(byte)2));
		priorityQueue.add(new Person("xiaodong",(short)19,(byte)3));
		priorityQueue.add(new Person("apple",(short)16,(byte)5));
		priorityQueue.add(new Person("zhaosi",(short)17,(byte)4));
		priorityQueue.add(new Person("zhaosi1",(short)11,(byte)6));
		priorityQueue.add(new Person("zhaosi2",(short)21,(byte)7));
		priorityQueue.add(new Person("zhaosi3",(short)30,(byte)8));
		System.out.println(priorityQueue.poll());//�Ƚ��ȳ���poll��ʱ��һ��������ģ��ȵ������ȼ���ߵ�
		System.out.println(priorityQueue);//������ʱ��һ������
		//���� iterator() ���ṩ�ĵ���������֤���κ��ض���˳��������ȼ������е�Ԫ�ء������Ҫ��˳��������뿼��ʹ�� Arrays.sort(pq.toArray())��
		
		/*Person[] p=new Person[priorityQueue.size()];
		priorityQueue.toArray(p);
		priorityQueue.clear();
		System.out.println(priorityQueue.size());
		Arrays.sort(p,new myComparator());
		System.out.println(Arrays.toString(p));*/
		
		/*Person[] a=(Person[]) priorityQueue.toArray();
		Arrays.sort(a,new myComparator());
		System.out.println(Arrays.toString(a));*/
		
		Object[] a=priorityQueue.toArray();
		Arrays.sort(a);//sort(Object[] a):����Ԫ�ص���Ȼ˳��(comparable,�����ȼ�����)��ָ���������鰴�����������
		System.out.println(Arrays.toString(a));
	}

}
