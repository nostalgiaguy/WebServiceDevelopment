/**
 * 
 */
package com.nostalgiaguy.soapservice.cxf.auth.property;

/**
 * @author nostalgiaguy
 *
 */

import java.util.List;

public class ASPThreadLocal {
	public static ThreadLocal<String> userThreadLocal = new ThreadLocal<String>();
	
	public static ThreadLocal<List<String> > headerThreadLocal = new ThreadLocal<List<String> >();
	

	public static String getUserName() {
		return userThreadLocal.get();
	}

	public static void setUserName(String userName) {
		ASPThreadLocal.userThreadLocal.set(userName);
	}

	public static void removeUserName() {
		userThreadLocal.remove();
	}
	
	
	public static List<String> getHeader() {
		return headerThreadLocal.get();
	}

	public static void setHeader(List<String> headerName) {
		ASPThreadLocal.headerThreadLocal.set(headerName);
	}
}
