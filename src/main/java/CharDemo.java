package com.imooc;

public class CharDemo {

	public static void main(String[] args) {
		// ����һ����������ַ�'a'
		char a='a';
		System.out.println("a="+a);
		char ch=65535;
		//�������ֵ����char��������ʾ�����ݷ�Χ����Ҫ����ǿ������ת����
		char ch1=(char)65536;
		System.out.println("ch="+ch);
		//����������unicode�����ʾ���ַ�
		char c='\u005d';
		System.out.println("c="+c);

	}

}
