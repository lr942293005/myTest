package com.neusoft.$temp.collection;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("zhangsan");
		stack.push("lisi");
		stack.push("wangwu");
		System.out.println(stack.pop());
		System.out.println(stack.peek());//��peek,pop�����鿴��ѭ����ȳ���ջ��˳��
		System.out.println(stack);//��ӡ˳��û��
	}
}
