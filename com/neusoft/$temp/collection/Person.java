package com.neusoft.$temp.collection;

/**
 * @Author: wwb
 * @Date: 2020/4/20 00:29
 */
class Person implements Comparable<Person>{
	private String name;
	private short age;
	private byte level;//���ȼ�

	public Person(String name, short age,byte level) {
		this.name = name;
		this.age = age;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public byte getLevel() {
		return level;
	}

	public void setLevel(byte level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", level=" + level + "]";
	}

	@Override
	public int compareTo(Person o) {//comparale��������Ķ����У���ΪҪ�ý������Ĳ���������������бȽ�
		if(level<o.getLevel()) {
			return 1;
		}else if(level>o.getLevel()) {
			return -1;
		}
		return 0;
	}

}
