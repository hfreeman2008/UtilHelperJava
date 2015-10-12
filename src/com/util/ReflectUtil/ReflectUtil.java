package com.util.ReflectUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectUtil {
	
	//获取类的信息,包括包，父类，接口，内部类，构造方法，属性，方法
	//输入参数的类的Class对象
	public static void showClassInfo(Class c){	
		//获取类的其它信息，如包，父类，接口，内部类等等
		getClassOtherInfo(c);
		//获取类的构造方法
		getConstructs(c);
		//获取类的属性
		GetFields(c);
		//获取类的方法
		getMethods(c);
	}
	
	
	
	//获取类的其它信息，如包，父类，接口，内部类等等
	private static void getClassOtherInfo(Class c) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("getClassOtherInfo");
		//获取类的包
		String p = c.getPackage().toString();
		System.out.println("类的包名："+p);
		System.out.println(" ");
		//获取类的父类
		Class parentClass = c.getSuperclass();
		System.out.println("类的父类："+parentClass.getName());
		System.out.println(" ");
		
		//获取类的接口
		Class[] interfaces =c.getInterfaces();
		if(interfaces.length >0){
			System.out.println("类的接口：");
			for(int i=0;i<interfaces.length;i++){				
				System.out.println("interfaces["+i+"] :"+interfaces[i]);
			}
		}
		System.out.println(" ");
		
		//获取类的内部类
		//getDeclaredClasses方法获取类本身定义的所有内部类，包括private
		Class[] innerClass1 =c.getDeclaredClasses();
		if(innerClass1.length >0){
			System.out.println("类的所有内部类 ，包括private：");
			for(int i=0;i<innerClass1.length;i++){				
				System.out.println("innerClass1["+i+"] :"+innerClass1[i]);
			}
		}
		System.out.println(" ");
		
		//同理getClasses方法获取类的public内部类，包括父类的public内部类
		Class[] innerClass2 =c.getClasses();
		if(innerClass2.length >0){
			System.out.println("类的public内部类，包括父类的public内部类：");
			for(int i=0;i<innerClass2.length;i++){				
				System.out.println("innerClass2["+i+"] :"+innerClass2[i]);
			}
		}
	}

	//获取类的属性
	private static void GetFields(Class c) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("GetFields");
		//getFields 此方法为获取类的public属性，包括父类的public属性
		System.out.println("getFields 此方法为获取类的public属性，包括父类的public属性 ");
		Field[] field1 = c.getFields();		
		for(int i=0;i<field1.length;i++){
			System.out.println("field1 ["+i+"] :"+field1[i]);
		}
		
		System.out.println(" ");
		//getDeclaredFields 此方法为获取类的本身声明的所有属性，包括private
		System.out.println("getDeclaredFields 此方法为获取类的本身声明的所有属性，包括private ");
		Field[] field2 = c.getDeclaredFields();		
		for(int i=0;i<field2.length;i++){
			System.out.println("field2 ["+i+"] :"+field2[i]);
		}
	}

	//获取类的方法
	private static void getMethods(Class c) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("getMethods");
		//getMethods 此方法为获取类的public方法，包括父类的public方法
		System.out.println("getMethods  此方法为获取类的public方法，包括父类的public方法 ");
		Method[] method1 = c.getMethods();		
		for(int i=0;i<method1.length;i++){
			System.out.println("method1 ["+i+"] :"+method1[i]);
		}
		System.out.println(" ");
		
		//getDeclaredMethods  此方法为获取类本身声明的所有方法，包括private
		System.out.println(" ");
		System.out.println("getDeclaredMethods  此方法为获取类本身声明的所有方法，包括private ");
		Method[] method2 = c.getDeclaredMethods();		
		for(int i=0;i<method2.length;i++){
			System.out.println("method2 ["+i+"] :"+method2[i]);
		}	
		
	}

	// 获取类的构造方法
	private static void getConstructs(Class c) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("getConstructs");
		//getConstructors  此方法为获取类的public的构造方法
		System.out.println("getConstructors  此方法为获取类的public的构造方法 ");
		Constructor[] constructors1 = c.getConstructors();
		for(int i=0;i<constructors1.length;i++){
			System.out.println("constructors ["+i+"] :"+constructors1[i]);
		}
		System.out.println(" ");
		
		//getDeclaredConstructors  此方法为获取类本身自己定义的所有构造方法
		System.out.println("getDeclaredConstructors  此方法为获取类本身自己定义的所有构造方法 ");
		Constructor[] constructors2 = c.getDeclaredConstructors();
		for(int i=0;i<constructors2.length;i++){
			System.out.println("constructors ["+i+"] :"+constructors2[i]);
		}
	}

}