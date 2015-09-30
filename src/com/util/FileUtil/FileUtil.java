package com.util.FileUtil;

import java.awt.print.Printable;
import java.io.File;
import java.io.IOException;

public class FileUtil {
	
	/** 
     * <b>方法说明：</b> 创建文件目录，若路径存在，就不生成 
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
     * <b>方法说明：</b> 本地，在指定路径生成文件。若文件存在，则删除后重建。 
     * @param dirName  本地路径名， 
     * @param file     文件
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
     * <b>详细描述：创建新文件，若文件存在则删除再创建，若不存在则直接创建</b> 
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
     * removeFile :删除文件
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
     * showAllFiles :列出指定目录下的全部文件（包括隐藏文件）
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
    * showAll :显示指定目录下的全部内容
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