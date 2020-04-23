package com.neusoft.$temp.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {//���Ը���ȥ�ص����ʣ������ݽ��д���

	public static void main(String[] args) {
		TreeSet<Person> tp=new TreeSet<Person>(new myComparator01());//��������Լ��ıȽ������������������ֲ�����Ĭ�ϵ� Comparator�����ǽ��бȽϣ��׳�ClassCastException��Person cannot be cast to java.lang.Comparable
		tp.add(new Person("xiaoli",(short)20,(byte)2));
		tp.add(new Person("zhangsan",(short)25,(byte)4));
		tp.add(new Person("lisi",(short)30,(byte)3));
		tp.add(new Person("lisi1",(short)20,(byte)6));
		tp.add(new Person("wangwu",(short)20,(byte)5));
		tp.add(new Person("zhaoliu",(short)18,(byte)1));
		//System.out.println(tp);//����ֱ�Ӵ�ӡ���϶���
		Iterator<Person> it=tp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

//�������䣨���֣���������
class myComparator implements Comparator<Person>{//�Ƚ����������������������һ������С�ڡ����ڻ���ڵڶ��������ֱ𷵻ظ������������������
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getAge()<o2.getAge()) {
			return -1;
		}else if(o1.getAge()>o2.getAge()) {
			return 1;
		}
		return 0;//0����ȥ�أ�����Ƚϵ��������ظ����������ȷ����ڴ���Ǹ�������ֱ���������������ݣ�
	}
}

class myComparator01 implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getAge()<o2.getAge()) {
			return -1;
		}else {
			return 1;//�������Ա����ظ�����
		}
	}
}

class myComparator02 implements Comparator<Person>{//���Է����������������Ϊ�������н������������ж���������Ϊ������ı�־����һ����С�ڵڶ������������򣬷�֮����
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getAge()<o2.getAge()) {
			return -2;
		}else if(o1.getAge()>o2.getAge()) {
			return 3;
		}
		return -3;//ֻҪ���Ƿ���0�������Ա����ظ�����
	}
}

class myComparator1 implements Comparator<Person>{//��������������ĸ����������
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getName().charAt(0)<o2.getName().charAt(0)) {
			return -1;
		}else if(o1.getName().charAt(0)>o2.getName().charAt(0)) {
			return 1;
		}
		return 0;
	}
}

class myComparator2 implements Comparator<Person>{
@Override
public int compare(Person o1, Person o2) {
	if (o2.getLevel() > o1.getLevel()) {
		return 1;
	} 
	else if (o2.getLevel() < o1.getLevel()) {
		return -1;
	}
	return 0;
}
}

