/**  

* <p>Title: FileTest.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: www.baidudu.com</p>  

* @author shenlan  

* @date 2019年5月20日  

* @version 1.0  

*/ 
package com.zhaoni.test;

import org.junit.Test;

import com.zhaoni.utils.FileUtil;

/**  

* <p>Title: FileTest</p>  

* <p>Description: </p>  

* @author shenlan  

* @date 2019年5月20日  

*/
public class FileTest {
	/**
	 * 测试
	
	 * <p>Title: test</p>  
	
	 * <p>Description: </p>
	 */
	@Test
	public void test() {
		String tempDirectory = FileUtil.getTempDirectory();
		System.out.println(tempDirectory);
		String userDirectory = FileUtil.getUserDirectory();
		System.out.println(userDirectory);
	}
}
