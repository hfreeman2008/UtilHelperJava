package com.util.DateUtil;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class TestMain {

	/***

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//判断二个日期的间距
		System.out.println("isWithInDateGap:"+DateHelp.isWithInDateGap(new Date(2015,10,1), new Date(2015,10,4), Calendar.DAY_OF_YEAR, 2));
		System.out.println("isWithInDateGap:"+DateHelp.isWithInDateGap("20151001", "20151004", Calendar.DAY_OF_YEAR, 5));	
		try {
			System.out.println("isWithInDateGap:"+DateHelp.isWithInDateGap(20151001, 20151004, Calendar.DAY_OF_YEAR, 5));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//获取当前日期
		System.out.println("getCurIntPcDate:"+DateHelp.getCurIntPcDate());
		System.out.println("getCurPcDate:"+DateHelp.getCurPcDate());
		System.out.println("getCurPcDate:"+DateHelp.getCurPcDate("yyyy-MM-dd"));
		System.out.println("getCurPcDateTime:"+DateHelp.getCurPcDateTime());
		System.out.println("getIntCurPcDateTime:"+DateHelp.getIntCurPcDateTime());	
		//获取当前Time
		System.out.println("getCurPcTime:"+DateHelp.getCurPcTime());
		//检查日期格式
		System.out.println("checkDateFormat:"+DateHelp.checkDateFormat(20151001));
		System.out.println("checkDateFormat:"+DateHelp.checkDateFormat("20151001"));
		System.out.println("checkDateFormat:"+DateHelp.checkDateFormat(20151001,"yyyyMMdd"));
		System.out.println("checkDateFormat:"+DateHelp.checkDateFormat(2015,"yyyy"));			
		//检查time格式
		System.out.println("checkTimeFormat:"+DateHelp.checkTimeFormat("120230"));
		System.out.println("checkTimeFormat:"+DateHelp.checkTimeFormat(120230,"HHmmss"));
		System.out.println("checkTimeFormat:"+DateHelp.checkTimeFormat("12-02-30","HH-mm-ss"));
		//转换为Date格式
		System.out.println("parseDate:"+DateHelp.parseDate("20151001"));
		System.out.println("parseDate:"+DateHelp.parseDate("2015-11-01","yyyy-MM-dd"));
		System.out.println("parseDate:"+DateHelp.parseDate(20151101,"yyyyMMdd"));
		System.out.println("parseDate:"+DateHelp.parseDate(20151101));
	    //将Date转换为string
		System.out.println("date2String:"+DateHelp.date2String(new Date(),"yyyy-MM-dd : HH-mm-ss"));
		System.out.println("date2String:"+DateHelp.date2String(new Date()));		
		//获取昨天的日期
		System.out.println("getCurrLastDay:"+DateHelp.getCurrLastDay());
		//获取当前日期的前days天的日期信息
		System.out.println("getCurrAfterDay:"+DateHelp.getCurrAfterDay(2));
		//获取交易日期之前的相隔days天数的日期 
		System.out.println("getTransDateBeforeDay:"+DateHelp.getTransDateBeforeDay(20151001,1));
		//获取指定日期之后的相隔n年的日期 
		System.out.println("getDateAfterYear:"+DateHelp.getDateAfterYear(20151001,3));
		// 获取交易日期之后的相隔天数的日期 
		System.out.println("getTransDateAfterDay:"+DateHelp.getTransDateAfterDay(20151001,3));
		//计算两个日期相差的天数 
		System.out.println("diffDate:"+DateHelp.diffDate(20151001,20110214));
	}
	
	****/
}