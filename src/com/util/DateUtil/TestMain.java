package com.util.DateUtil;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class TestMain {

	/***

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ж϶������ڵļ��
		System.out.println("isWithInDateGap:"+DateHelp.isWithInDateGap(new Date(2015,10,1), new Date(2015,10,4), Calendar.DAY_OF_YEAR, 2));
		System.out.println("isWithInDateGap:"+DateHelp.isWithInDateGap("20151001", "20151004", Calendar.DAY_OF_YEAR, 5));	
		try {
			System.out.println("isWithInDateGap:"+DateHelp.isWithInDateGap(20151001, 20151004, Calendar.DAY_OF_YEAR, 5));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//��ȡ��ǰ����
		System.out.println("getCurIntPcDate:"+DateHelp.getCurIntPcDate());
		System.out.println("getCurPcDate:"+DateHelp.getCurPcDate());
		System.out.println("getCurPcDate:"+DateHelp.getCurPcDate("yyyy-MM-dd"));
		System.out.println("getCurPcDateTime:"+DateHelp.getCurPcDateTime());
		System.out.println("getIntCurPcDateTime:"+DateHelp.getIntCurPcDateTime());	
		//��ȡ��ǰTime
		System.out.println("getCurPcTime:"+DateHelp.getCurPcTime());
		//������ڸ�ʽ
		System.out.println("checkDateFormat:"+DateHelp.checkDateFormat(20151001));
		System.out.println("checkDateFormat:"+DateHelp.checkDateFormat("20151001"));
		System.out.println("checkDateFormat:"+DateHelp.checkDateFormat(20151001,"yyyyMMdd"));
		System.out.println("checkDateFormat:"+DateHelp.checkDateFormat(2015,"yyyy"));			
		//���time��ʽ
		System.out.println("checkTimeFormat:"+DateHelp.checkTimeFormat("120230"));
		System.out.println("checkTimeFormat:"+DateHelp.checkTimeFormat(120230,"HHmmss"));
		System.out.println("checkTimeFormat:"+DateHelp.checkTimeFormat("12-02-30","HH-mm-ss"));
		//ת��ΪDate��ʽ
		System.out.println("parseDate:"+DateHelp.parseDate("20151001"));
		System.out.println("parseDate:"+DateHelp.parseDate("2015-11-01","yyyy-MM-dd"));
		System.out.println("parseDate:"+DateHelp.parseDate(20151101,"yyyyMMdd"));
		System.out.println("parseDate:"+DateHelp.parseDate(20151101));
	    //��Dateת��Ϊstring
		System.out.println("date2String:"+DateHelp.date2String(new Date(),"yyyy-MM-dd : HH-mm-ss"));
		System.out.println("date2String:"+DateHelp.date2String(new Date()));		
		//��ȡ���������
		System.out.println("getCurrLastDay:"+DateHelp.getCurrLastDay());
		//��ȡ��ǰ���ڵ�ǰdays���������Ϣ
		System.out.println("getCurrAfterDay:"+DateHelp.getCurrAfterDay(2));
		//��ȡ��������֮ǰ�����days���������� 
		System.out.println("getTransDateBeforeDay:"+DateHelp.getTransDateBeforeDay(20151001,1));
		//��ȡָ������֮������n������� 
		System.out.println("getDateAfterYear:"+DateHelp.getDateAfterYear(20151001,3));
		// ��ȡ��������֮���������������� 
		System.out.println("getTransDateAfterDay:"+DateHelp.getTransDateAfterDay(20151001,3));
		//�������������������� 
		System.out.println("diffDate:"+DateHelp.diffDate(20151001,20110214));
	}
	
	****/
}