/**  

* <p>Title: DateTest.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author shenlan  

* @date 2019年5月20日  

* @version 1.0  

*/ 
package com.zhaoni.test;

import org.junit.Test;

import com.zhaoni.utils.DateUtil;

/**  

* <p>Title: DateTest</p>  

* <p>Description: </p>  

* @author shenlan  

* @date 2019年5月20日  

*/
public class DateTest {
	/**
	 * 测试
	
	 * <p>Title: test</p>  
	
	 * <p>Description: </p>
	 */
	@Test
	public void test() {
		String start = DateUtil.getStart("2018-5-10");
		System.out.println(start);
		String end = DateUtil.getEnd("2018-5-10");
		System.out.println(end);
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		String string = sql.substring(42, 45);
		String replace = sql.replace(string, start);
		String string1 = sql.substring(64, 67);
		String replace1 = sql.replace(string1, end);
		System.out.println(replace);
		System.out.println(replace1);
	}
}
