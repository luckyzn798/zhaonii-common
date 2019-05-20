/**  

* <p>Title: DateUtil.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author shenlan  

* @date 2019年5月20日  

* @version 1.0  

*/ 
package com.zhaoni.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**  

* <p>Title: DateUtil</p>  

* <p>Description: </p>  

* @author shenlan  

* @date 2019年5月20日  

*/
public class DateUtil {
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static String getStart(String date){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = getCalendar(date);
		c1.set(Calendar.DAY_OF_MONTH, 1);
		Date date2 = c1.getTime();
		return df.format(date2);
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static String getEnd(String date){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = getCalendar(date);
		c1.add(Calendar.MONTH, 1);
		c1.set(Calendar.DAY_OF_MONTH, 0);
		Date date2 = c1.getTime();
		return df.format(date2);
	}
	
	/**
	 * 
	
	 * <p>Title: getCalendar</p>  
	
	 * <p>Description: </p>  
	
	 * @param date
	 * @return
	 */
	public static Calendar getCalendar(String date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = Calendar.getInstance();
		if(null!=date && date.length()>0) {
			try {
				Date date2 = df.parse(date);
				c1.setTime(date2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return c1;
	}
	

}
