package com.neusoft.$temp.fanxing.plus;

import java.util.ArrayList;
import java.util.List;

public class extendsAndSuper {

	public static void main(String[] args) {
		List<? extends Fruit> fruits;//<? extends E>:����E���ͻ���E�������͡� <? extends E> �� Upper Bound�����ޣ� ��ͨ�������������Ԫ�ص����͵�����,<?>��<? extends Object>�ļ�д
		fruits = new ArrayList<Fruit>();
		fruits = new ArrayList<Apple>();
		//fruits = new ArrayList<Object>();//������Ԫ������ΪFruit�ĸ���,���벻ͨ��
		
		//д��,�����У�<? extends Fruit>ֻ�Ǹ��߱�����������Ԫ�ص��������ޣ����ľ���ʵ�������ǲ�ȷ���ģ���Ȼ�ǲ�ȷ���ģ�Ϊ�����Ͱ�ȫ��������ֻ����ֹ���Ԫ���ˡ�
		//fruits.add(new Fruit());//���벻ͨ��
		//fruits.add(new Apple());//���벻ͨ�������統���һ��Appleʱ����fruits��ʱ������ArrayList<Banana>ʵ�֣���Ȼ���;Ͳ�������
		//fruits.add(new Object());//���벻ͨ��
		fruits.add(null);//null���Ա�ʾ�κ�����,�������
		
		//��ȡ,�����ԣ�����fruits��ʲô��ʵ�֣�������������ȷ����ȡ��Ԫ����Fruit���͵����࣬���Զ�ȡ�����е�Ԫ���������
		Fruit fruit = fruits.get(0);//����ͨ��������ȷ����ȡ��Ԫ����Fruit����
		Apple apple=(Apple) fruits.get(1);//��Ҫǿ������ת������ȷ����ȡ��Ԫ����ʲô����
		Object object=fruits.get(0);//�������͵ĸ���Ҳ�ǿ��Ե�
		
		
		
		List<? super Apple> apples;//<��super E>:����E���ͻ���E�ĸ����͡� <? super E> �� Lower Bound�����ޣ� ��ͨ��� ����������Ԫ�ص���������
		apples = new ArrayList<Apple>();
		apples = new ArrayList<Fruit>();
		apples = new ArrayList<Object>();
		//apples = new ArrayList<RedApple>();//������Ԫ������ΪApple������,���벻ͨ��
		
		//д��,<? extends Fruit>ֻ�Ǹ��߱�����������Ԫ�ص��������ޣ�apples��װ��Ԫ����Apple��Apple��ĳ�����࣬�����޷�ȷ�����ĸ��������ͣ����ǿ���ȷ������Apple��Apple�������Ǻ��������ȷ�����ࡱ���ݵģ�
		//�����۱�ʲôʵ�֣�Apple������������ӽ�ȥ
		apples.add(new Apple());
		apples.add(new RedApple());
		//apples.add(new Fruit());//���벻ͨ��,���統��apples�����һ��Fruit���Ͷ���ʱ������ʱapplesָ��ArrayList<Apple>����Ȼ���;Ͳ�������
		
		//��ȡ,�����ԣ���Ȼ�޷�ȷ���Ļ�ȡ��Ԫ�ؾ�����ʲô���ͣ�����ȷ��һ����Object���͵����࣬����������ô洢��ȥ�Ķ�Ӧ���͵�Ԫ�ؾ�ֻ�ܽ���ǿ������ת����
		Apple apple1 = (Apple)apples.get(0);//��ȡ��Ԫ��ΪObject����
		Fruit fruit1 = (Fruit) apples.get(0);
		Object object1=apples.get(0);
		
		//�������ˣ�JDK1.5���뷺�͵�Ŀ����Ϊ�˱���ǿ������ת���ķ�����������ôʹ�÷���<? super E>�����أ�����͵�̸������PECS������ 
		//���Ҫ�Ӽ����ж�ȡ����T������(�����ṩ����)�����Ҳ���д�룬����ʹ�� ? extends ͨ�����(Producer Extends)
		//���Ҫ�Ӽ�����д������T������(������������)�����Ҳ���Ҫ��ȡ������ʹ�� ? super ͨ�����(Consumer Super)
		//�����Ҫ����Ҫȡ����ô�Ͳ�Ҫʹ���κ�ͨ�����
	/*�ܽ᣺
    < ? extends E >
        add�� ��������� �κ� Ԫ�أ�
        get�� ���Ի�ȡԪ�أ����Ǳ���ʹ�� E ������Ԫ�أ�
    < ? super E >
        add: ������� E��E������ Ԫ�أ�
        get: ���Ի�ȡԪ�أ����������Ϣ��ʧ�ˣ����Է���ֻ��ʹ��Object���������ܣ������Ҫ�Լ���������Ҫǿ������ת����*/

	}
}
