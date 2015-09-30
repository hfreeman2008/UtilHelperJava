package com.util.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;  

/**
 * ��˵�� : ���ڹ����� 
 * @author hexiaoming
 * @since  2015-9-29
 */
public class DateHelp {
	
    public final static String DATE_FROMAT = "yyyyMMdd";      
    public final static String TIME_FORMAT = "HHmmss";  
	
    /** 
     * ���������Ƿ��ڿ��֮�� 
     * @param startDate 
     * @param endDate 
     * @param gapType  ������ͣ���Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_YEAR 
     * @param maxGap   �����ֵ 
     * @return 
     */  
    public static boolean isWithInDateGap(Date startDate, Date endDate,int gapType, int maxGap) {  
        if (startDate == null) {  
            throw new IllegalArgumentException("The startDate must not be null");  
        }  
        if (endDate == null) {  
            throw new IllegalArgumentException("The endDate must not be null");  
        }  
        if (gapType != Calendar.YEAR && gapType != Calendar.MONTH  && gapType != Calendar.DAY_OF_YEAR) {  
            throw new IllegalArgumentException("The value of gapType is invalid");  
        }  
  
        Calendar start = Calendar.getInstance();  
        start.setTime(startDate);  
        start.add(gapType, maxGap);  
        int compare = start.getTime().compareTo(endDate);
        return compare >= 0;  
    }  
  
    /** 
     * ���������Ƿ��ڿ��֮�� 
     * @param startDate 
     * @param endDate 
     * @param gapType  ������ͣ���Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_YEAR 
     * @param maxGap   �����ֵ 
     * @return 
     * @throws ParseException 
     */  
    public static boolean isWithInDateGap(String startDate, String endDate,int gapType, int maxGap) {  
        Date startDateTime = null;  
        Date endDateTime = null;  
        try{  
            startDateTime = DateUtils.parseDate(startDate, DATE_FROMAT);  
            endDateTime = DateUtils.parseDate(endDate, DATE_FROMAT);  
        }catch(ParseException e){  
            //throw new ServiceException��*****,new String[]{"��������"}, "��ʼ���ڣ�" + startDate + ",�������ڣ�" + endDate);
        	throw new IllegalArgumentException("��������"+"��ʼ���ڣ�" + startDate + ",�������ڣ�" + endDate);
        }  
        return isWithInDateGap(startDateTime,endDateTime, gapType, maxGap);  
    }  
  
    /** 
     * ���������Ƿ��ڿ��֮�� 
     * @param startDate 
     * @param endDate 
     * @param gapType ������ͣ���Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_YEAR 
     * @param maxGap  �����ֵ 
     * @return 
     * @throws ParseException 
     */  
    public static boolean isWithInDateGap(int startDate, int endDate, int gapType, int maxGap) throws ParseException  {  
        return isWithInDateGap(  
                DateUtils.parseDate(String.valueOf(startDate), DATE_FROMAT),  
                DateUtils.parseDate(String.valueOf(endDate), DATE_FROMAT),  
                gapType, maxGap);  
    }  
  
    /** 
     * <b>˵��:</b> ��ȡϵͳ��ǰ���� 
     * @return
     */  
    public static int getCurIntPcDate()  {  
        return Integer.parseInt(getCurPcDate());  
    }  
  
    /** 
     * <b>˵��:</b> ��ȡϵͳ��ǰ���� 
     * @param 
     * @return
     */  
    public static String getCurPcDate() {  
        java.util.Date currentDate = new java.util.Date();  
        SimpleDateFormat formatdate = new SimpleDateFormat(DATE_FROMAT);  
        return formatdate.format(currentDate);  
    }  
  
    /*** 
     * <b>˵��:</b> ��ȡָ����ʽ��ϵͳ��ǰ���� 
     * @param 
     * @return 
     */  
    public static String getCurPcDate(String strFormat)  
    {  
        java.util.Date currentDate = new java.util.Date();  
        SimpleDateFormat formatdate = new SimpleDateFormat(strFormat);  
        return formatdate.format(currentDate);  
    }  
  
    /*** 
     * <b>˵��:</b>  ��ȡ��ʱϵͳ����ʱ�䡾YYYYMMDDHHmmss�� 
     * @param 
     * @return  
     * @throws ServiceException 
     */  
    public static String getCurPcDateTime()  
    {  
        java.util.Date currentDate = new java.util.Date();  
        SimpleDateFormat formatdate = new SimpleDateFormat(DATE_FROMAT+TIME_FORMAT);  
        return formatdate.format(currentDate);  
    }  
  
    /** 
     * <b>˵��:</b> ��ȡ��ʱϵͳ����ʱ�䡾YYYYMMDDHHmmss�� 
     * @param 
     * @return  
     */  
    public static Long getIntCurPcDateTime()  
    {  
        return Long.valueOf(getCurPcDateTime());  
    }  
  
  
    /** 
     * <b>˵��:</b> ��ȡϵͳ��ǰʱ�� 
     * @param 
     * @return ��ǰʱ�䲢��ʽ���ɡ�HHmmss��,�硰123124�� 
     */  
    public static String getCurPcTime()  {  
        java.util.Date currentDate = new java.util.Date();  
        SimpleDateFormat formatdate = new SimpleDateFormat(TIME_FORMAT);  
        return formatdate.format(currentDate);  
    }     
  
    /** 
     * <b>˵��: </b>��֤������ֵ������[YYYYMMDD]�Ƿ�Ϸ� 
     * @param 
     * @return 
     */  
    public static boolean checkDateFormat(int intDate) {  
        return checkDateFormat(String.valueOf(intDate));  
    }  
  
    /** 
     * <b>˵��: </b>��֤�����ַ�������[YYYYMMDD]�Ƿ�Ϸ� 
     * @param 
     * @return 
     */  
    public static boolean checkDateFormat(String strDate) {  
        return checkDateFormat(strDate, DATE_FROMAT);  
    }  
  
    /** 
     * <b>˵��: </b>��֤�����ַ��������Ƿ�Ϸ� 
     * @param 
     * @return 
     */  
    public static boolean checkDateFormat(int intDate, String strFormat) {  
        return checkDateFormat(String.valueOf(intDate), strFormat);  
    }  
  
    /** 
     * <b>˵��: </b>��֤�����ַ��������Ƿ�Ϸ� 
     * @param 
     * @return 
     */  
    public static boolean checkDateFormat(String strDate, String strFormat)  
    {  
        try {  
            DateUtils.parseDateStrictly(strDate, strFormat);  
            return true;  
        } catch (ParseException e) {  
            return false;  
        }  
    }  
  
  
    /** 
     * <b>˵��: </b>��֤�����ַ���ʱ��[HH24MMSS]�Ƿ�Ϸ� 
     * @param 
     * @return 
     */  
    public static boolean checkTimeFormat(String strDate) {  
        return checkTimeFormat(strDate, TIME_FORMAT);  
    }  
  
    /** 
     * <b>˵��: </b>��֤�����ַ���ʱ���Ƿ�Ϸ� 
     * @param
     */  
    public static boolean checkTimeFormat(int intDate, String strFormat) {  
        return checkTimeFormat(String.valueOf(intDate), strFormat);  
    }  
  
    /** 
     * <b>˵��: </b>��֤�����ַ���ʱ���Ƿ�Ϸ� 
     * @param 
     * @return
     */  
    public static boolean checkTimeFormat(String strDate, String strFormat){  
        try {  
            DateUtils.parseDateStrictly(strDate, strFormat);  
            return true;  
        } catch (ParseException e) {  
            return false;  
        }  
    }  
  
    /** 
     * <b>˵��: </b>����ת�� 
     * @param strDate 
     * @return 
     */  
    public static Date parseDate(String strDate){  
        return parseDate(strDate, DATE_FROMAT);  
    }  
    /** 
     * <b>˵��: </b>����ת�� 
     * @param strDate 
     * @param strFormat 
     * @return 
     */  
    public static Date parseDate(String strDate,String strFormat){  
        try {  
            return DateUtils.parseDateStrictly(strDate, strFormat);  
        } catch (ParseException e) {  
            //throw new ServiceException(CtsErrorCode.ERROR_FORMAT,new String[]{"��������"}, "���ڣ�" + strDate);
        	throw new IllegalArgumentException("���ڣ�" + strDate);
        }  
    }  
    /** 
     * <b>˵��: </b>����ת�� 
     * @param intDate 
     * @param strFormat 
     * @return 
     */  
    public static Date parseDate(int intDate,String strFormat){  
        return parseDate(String.valueOf(intDate), strFormat);  
    }  
    /** 
     * <b>˵��: </b>����ת�� 
     * @param intDate 
     * @return 
     */  
    public static Date parseDate(int intDate){  
        return parseDate(String.valueOf(intDate));  
    }  
  
    /** 
     * ����ת�����ַ��� 
     * @param date 
     * @param dateFormat 
     * @return 
     */  
    public static String date2String(Date date,String dateFormat) {  
        SimpleDateFormat formatdate = new SimpleDateFormat(dateFormat);  
        return formatdate.format(date);  
    }  
    /** 
     * ����ת�����ַ��� 
     * @param date 
     * @param dateFormat 
     * @return ��ʽΪYYYYMMDD 
     */  
    public static String date2String(Date date) {  
        return date2String(date,DATE_FROMAT);  
    }  
  
    /** 
     * ����ת�������� 
     * @param date 
     * @param dateFormat 
     * @return ��ʽΪYYYYMMDD 
     */  
    public static int date2Int(Date date) {  
        String str = date2String(date,DATE_FROMAT);  
        return Integer.parseInt(str);  
    }  
  
    /*** 
     * ��ȡ���������
     * @param 
     * @return  
     * @throws ServiceException 
     */  
    public static String getCurrLastDay()  
    {  
        return getCurrAfterDay(1);  
    }  
    /*** 
     * ��ȡ��ǰ���ڵ�ǰdays���������Ϣ
     * @param 
     * @return  
     * @throws ServiceException 
     */  
    public static String getCurrAfterDay(int days)  
    {  
        Calendar theCa = Calendar.getInstance();  
        theCa.setTime(new Date());        
        theCa.add(theCa.DATE, -1*days);  
        Date date = theCa.getTime();  
        SimpleDateFormat formatdate = new SimpleDateFormat(DATE_FROMAT);  
        return formatdate.format(date);  
    }  
    /** 
     * ��ȡ��������֮ǰ�����days���������� 
     * @param transDate �������� 
     * @param days ���� 
     * @return
     */  
    public static Integer getTransDateBeforeDay(Integer transDate,int days){  
        Calendar theCa = Calendar.getInstance();  
        theCa.setTime(parseDate(transDate));          
        theCa.add(Calendar.DATE, -1*days);  
        Date date = theCa.getTime();  
        SimpleDateFormat formatdate = new SimpleDateFormat(DATE_FROMAT);  
        return Integer.valueOf(formatdate.format(date));  
    }  
      
    /** 
     * ��ȡָ������֮������n������� 
     * @param transDate 
     * @param years 
     * @return Integer 
     */  
    public static Integer getDateAfterYear(Integer transDate, int years) {  
        Calendar theCa = Calendar.getInstance();  
        theCa.setTime(parseDate(transDate));  
        theCa.add(Calendar.YEAR, years);  
        Date date = theCa.getTime();  
        SimpleDateFormat formatdate = new SimpleDateFormat(DATE_FROMAT);  
        return Integer.valueOf(formatdate.format(date));  
    }  
      
    /** 
     * ��ȡ��������֮���������������� 
     * @param transDate �������� 
     * @param days ���� 
     * @return 
     */  
    public static Integer getTransDateAfterDay(Integer transDate,int days){        
        Calendar theCa = Calendar.getInstance();  
        theCa.setTime(parseDate(transDate));          
        theCa.add(Calendar.DATE, 1*days);  
        Date date = theCa.getTime();  
        SimpleDateFormat formatdate = new SimpleDateFormat(DATE_FROMAT);  
        return Integer.valueOf(formatdate.format(date));  
    }  
          
    /** 
     * �������������������� 
     * @param beginDate ��YYYYMMDD�� 
     * @param endDate  ��YYYYMMDD�� 
     * @return Integer 
     */  
    public static Integer diffDate(Integer beginDate,Integer endDate){                        
            Calendar theCa1= Calendar.getInstance();    
            Calendar theCa2= Calendar.getInstance();    
            theCa1.setTime(parseDate(beginDate));    
            theCa2.setTime(parseDate(endDate));        
            long between_days=(theCa2.getTimeInMillis()-theCa1.getTimeInMillis())/(1000*3600*24);    
            return Math.abs(Integer.parseInt(String.valueOf(between_days)));
            //return Integer.parseInt(String.valueOf(between_days));    
    }  
}