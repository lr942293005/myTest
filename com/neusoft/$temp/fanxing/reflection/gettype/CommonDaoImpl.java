package com.neusoft.$temp.fanxing.reflection.gettype;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class CommonDaoImpl<T> implements CommonDao<T>{
//this��super,�÷����ø��෺�͵ľ�������,�Զ�����ʵ�����÷���
	@Override
	public void test() {
		System.out.println(this.getClass().getName());//thisָ�������������Ϊ����test������������û�У�������ֱ���ø����test���������Լ������ã�˭����thisָ˭
		System.out.println(super.getClass().getName());//super��thisָ��Ķ�����ͬһ������ʹ���ߵ�hash��Ҳ��һ����ֻ������ͨ��superȥ���ø��౻���صĶ���
		//��ȡ��������ͣ��������ͣ�������ķ����Ѿ�ӳ�䵽������
		Type type=this.getClass().getGenericSuperclass();//��Ȼд���˸���ķ�����������������࣬��this��CustomerDaoImpl����getGenericSuperclass��CommonDaoImpl��ͬ���Ͷ����˳���
		System.out.println(this.getClass().getGenericSuperclass());
		//ParameterizedType��ǿ��Ļ�ȡ���͵����Ͳ����ķ���
		ParameterizedType parameterizedType=(ParameterizedType)type;
		//ͨ��getActualTypeArguments������ȡ�������ʵ�����ͣ�����Type����
		Type[] parentTypes=parameterizedType.getActualTypeArguments();
		//�̳����ã���һ��Ԫ�ؼ�������Ҫ��
		Type jutiType=parentTypes[0];
		System.out.println(jutiType);
		try {
			//getTypeName�����õ��Ӱ����������
			Class clazz = Class.forName(jutiType.getTypeName());
			System.out.println(jutiType.getTypeName());
			clazz.getMethod("test", null).invoke(clazz.newInstance(), null);//.newInstance()�������޲ι������ʹ��
		} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | InstantiationException e) {
			e.printStackTrace();
		}
	}
	
}
