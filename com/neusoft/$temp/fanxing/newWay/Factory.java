package com.neusoft.$temp.fanxing.newWay;

//public class Factory<T extends MyService<T>&MyService2<T>> {
public class Factory<T extends Qishui> {//�෺��,ʹ�����������ʵ���ܹ�ƾ���ͽ���ɸѡ����ȷ�����͵�����ɸѡ
	//�෺�Ϳ���ȥ�̳в���ʵ����
	//T t;//����ֱ����������
	//T t1=new T();//���󣬲���ֱ��new���ͣ��������淽ʽʵ��
	//T t1=(T) new Object();
	//T t2=(T)Integer.valueOf((int)t/2);
	//T t2=new T[100];//���󣬲��ܴ������͵����飬�������淽ʽʵ��
	//T[] t2=(T[])new Object[100];//ͬ����
	/*static {//��̬������в����÷���
		T t;
	}*/
	private T attr;
	//�쳣�༰��������Ҳ�����÷���
	Qishui[] qishuis=new Qishui[100];
	int i=0;
	
	public void produce(T qishui) {
		qishuis[i++]=qishui;//��������Ԫ�أ����ñ�־�ļ򵥷�ʽ
	}
	//ע���ʽ
	public <M extends ZeroKele> void jiamtc (M kele){//�������ͣ���ͨ������ָ��ĳһ���͵����ݣ�ȷ����ŵ�����
		//����extends����ֻ����ĳһ�������
		System.out.println("��ľ�Ǵ�");
	}
	
	/*@Override
	public String toString() {//ֻ��Ծ���Ķ����Ӧ�������toString��������
		return "Factory [qishuis=" + Arrays.toString(qishuis) + ", i=" + i + "]";
	}*/
	
}
