package com.util.FileUtil;

import java.awt.print.Printable;
import java.io.File;
import java.io.IOException;

public class FileUtil {
	
	/** 
     * <b>����˵����</b> �����ļ�Ŀ¼����·�����ڣ��Ͳ����� 
     * @param 
     * @return
     */  
    public static void createDocDir(String dirName) {  
        File file = new File(dirName);  
        if (!file.exists()) {  
            file.mkdirs();  
        }  
    }  
   
  
    /** 
     * <b>����˵����</b> ���أ���ָ��·�������ļ������ļ����ڣ���ɾ�����ؽ��� 
     * @param dirName  ����·������ 
     * @param file     �ļ�
     */  
    public static void creatFileByName(File file){  
        try {    
            file.createNewFile();  
        }  
        catch (IOException e) {  
        	System.out.println("create file fail:"+file.getAbsolutePath()+e);
        }  
    }  
    
    /** 
     * <b>��ϸ�������������ļ������ļ�������ɾ���ٴ���������������ֱ�Ӵ���</b> 
     * @param   
     * @returnType File 
     */  
    public static File createNewFile(String fileName) {  
        File file = new File(fileName);  
        creatFileByName(file);  
        return file;  
    }  
    
    /**
     * 
     * removeFile :ɾ���ļ�
     * @param 
     * @return void
     * @throws 
     * @param path
     */
    public static void removeFile(String path){
    	File file = new File(path);
    	file.deleteOnExit();
    }
   

    /**
     * 
     * showAllFiles :�г�ָ��Ŀ¼�µ�ȫ���ļ������������ļ���
     * @param 
     * @return void
     * @throws 
     * @param path
     */
    public static void showAllFiles(String path){
    	File file = new File(path);
    	File[] listFiles = file.listFiles();
    	System.out.println(path+" contain all files:");
    	for(File listFile:listFiles){  		
    		System.out.println(listFile);
    	}
    }
  
    
   /**
    * 
    * showAll :��ʾָ��Ŀ¼�µ�ȫ������
    * @param 
    * @return void
    * @throws 
    * @param path
    */
    public static void showAll(String path){
    	File file = new File(path);
    	Print(file);   	
    }


	/**
	 * Print :
	 * @param 
	 * @return void
	 * @throws 
	 * @param file
	 */
	private static void Print(File file) {
		// TODO Auto-generated method stub
		if(file != null){
    		if(file.isDirectory()){
    			File[] fileArrays = file.listFiles();
    			if(fileArrays != null){
        			for(File fileArray:fileArrays){
            			if(fileArray != null){
            				Print(fileArray);
            			}
        			}
    			}
    		}else{
    			System.out.println(file);
    		}
    	}
	}
 

}