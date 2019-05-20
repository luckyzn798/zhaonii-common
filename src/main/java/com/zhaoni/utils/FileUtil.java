/**  

* <p>Title: FileUtil.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author shenlan  

* @date 2019年5月20日  

* @version 1.0  

*/ 
package com.zhaoni.utils;

import java.io.File;

import org.junit.Test;

/**  

* <p>Title: FileUtil</p>  

* <p>Description: </p>  

* @author shenlan  

* @date 2019年5月20日  

*/
public class FileUtil {
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName){
		
		return fileName;
	}
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	public static String getTempDirectory(){
		String temp = System.getProperty("java.io.tmpdir");
		return temp;
	}
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static String getUserDirectory(){
		String home = System.getProperty("user.home");
		return home;
	}
	
}
