package com.util.ReflectUtil;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取类的信息,包括包，父类，接口，内部类，构造方法，属性，方法
		//输入参数的类的Class对象
		//使用方法
		//ReflectUtil.showClassInfo(JavaClassName.class);
		ReflectUtil.showClassInfo(ArrayList.class);
	}
}