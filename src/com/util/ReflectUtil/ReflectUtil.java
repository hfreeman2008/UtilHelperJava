package com.util.ReflectUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectUtil {
	
	//��ȡ�����Ϣ,�����������࣬�ӿڣ��ڲ��࣬���췽�������ԣ�����
	//������������Class����
	public static void showClassInfo(Class c){	
		//��ȡ���������Ϣ����������࣬�ӿڣ��ڲ���ȵ�
		getClassOtherInfo(c);
		//��ȡ��Ĺ��췽��
		getConstructs(c);
		//��ȡ�������
		GetFields(c);
		//��ȡ��ķ���
		getMethods(c);
	}
	
	
	
	//��ȡ���������Ϣ����������࣬�ӿڣ��ڲ���ȵ�
	private static void getClassOtherInfo(Class c) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("getClassOtherInfo");
		//��ȡ��İ�
		String p = c.getPackage().toString();
		System.out.println("��İ�����"+p);
		System.out.println(" ");
		//��ȡ��ĸ���
		Class parentClass = c.getSuperclass();
		System.out.println("��ĸ��ࣺ"+parentClass.getName());
		System.out.println(" ");
		
		//��ȡ��Ľӿ�
		Class[] interfaces =c.getInterfaces();
		if(interfaces.length >0){
			System.out.println("��Ľӿڣ�");
			for(int i=0;i<interfaces.length;i++){				
				System.out.println("interfaces["+i+"] :"+interfaces[i]);
			}
		}
		System.out.println(" ");
		
		//��ȡ����ڲ���
		//getDeclaredClasses������ȡ�౾����������ڲ��࣬����private
		Class[] innerClass1 =c.getDeclaredClasses();
		if(innerClass1.length >0){
			System.out.println("��������ڲ��� ������private��");
			for(int i=0;i<innerClass1.length;i++){				
				System.out.println("innerClass1["+i+"] :"+innerClass1[i]);
			}
		}
		System.out.println(" ");
		
		//ͬ��getClasses������ȡ���public�ڲ��࣬���������public�ڲ���
		Class[] innerClass2 =c.getClasses();
		if(innerClass2.length >0){
			System.out.println("���public�ڲ��࣬���������public�ڲ��ࣺ");
			for(int i=0;i<innerClass2.length;i++){				
				System.out.println("innerClass2["+i+"] :"+innerClass2[i]);
			}
		}
	}

	//��ȡ�������
	private static void GetFields(Class c) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("GetFields");
		//getFields �˷���Ϊ��ȡ���public���ԣ����������public����
		System.out.println("getFields �˷���Ϊ��ȡ���public���ԣ����������public���� ");
		Field[] field1 = c.getFields();		
		for(int i=0;i<field1.length;i++){
			System.out.println("field1 ["+i+"] :"+field1[i]);
		}
		
		System.out.println(" ");
		//getDeclaredFields �˷���Ϊ��ȡ��ı����������������ԣ�����private
		System.out.println("getDeclaredFields �˷���Ϊ��ȡ��ı����������������ԣ�����private ");
		Field[] field2 = c.getDeclaredFields();		
		for(int i=0;i<field2.length;i++){
			System.out.println("field2 ["+i+"] :"+field2[i]);
		}
	}

	//��ȡ��ķ���
	private static void getMethods(Class c) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("getMethods");
		//getMethods �˷���Ϊ��ȡ���public���������������public����
		System.out.println("getMethods  �˷���Ϊ��ȡ���public���������������public���� ");
		Method[] method1 = c.getMethods();		
		for(int i=0;i<method1.length;i++){
			System.out.println("method1 ["+i+"] :"+method1[i]);
		}
		System.out.println(" ");
		
		//getDeclaredMethods  �˷���Ϊ��ȡ�౾�����������з���������private
		System.out.println(" ");
		System.out.println("getDeclaredMethods  �˷���Ϊ��ȡ�౾�����������з���������private ");
		Method[] method2 = c.getDeclaredMethods();		
		for(int i=0;i<method2.length;i++){
			System.out.println("method2 ["+i+"] :"+method2[i]);
		}	
		
	}

	// ��ȡ��Ĺ��췽��
	private static void getConstructs(Class c) {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("getConstructs");
		//getConstructors  �˷���Ϊ��ȡ���public�Ĺ��췽��
		System.out.println("getConstructors  �˷���Ϊ��ȡ���public�Ĺ��췽�� ");
		Constructor[] constructors1 = c.getConstructors();
		for(int i=0;i<constructors1.length;i++){
			System.out.println("constructors ["+i+"] :"+constructors1[i]);
		}
		System.out.println(" ");
		
		//getDeclaredConstructors  �˷���Ϊ��ȡ�౾���Լ���������й��췽��
		System.out.println("getDeclaredConstructors  �˷���Ϊ��ȡ�౾���Լ���������й��췽�� ");
		Constructor[] constructors2 = c.getDeclaredConstructors();
		for(int i=0;i<constructors2.length;i++){
			System.out.println("constructors ["+i+"] :"+constructors2[i]);
		}
	}

}