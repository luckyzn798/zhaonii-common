/**  

* <p>Title: SteamTest.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author shenlan  

* @date 2019年5月20日  

* @version 1.0  

*/ 
package com.zhaoni.test;

import java.io.InputStream;

import org.junit.Test;

import com.zhaoni.utils.StreamUtil;

/**  

* <p>Title: SteamTest</p>  

* <p>Description: </p>  

* @author shenlan  

* @date 2019年5月20日  

*/
public class SteamTest {

	/**
	 * 测试
	
	 * <p>Title: test</p>  
	
	 * <p>Description: </p>
	 */
	@Test
	public void test() {
		String readTextFile = StreamUtil.readTextFile("asd");
		System.out.println(readTextFile);
	}
	
}
