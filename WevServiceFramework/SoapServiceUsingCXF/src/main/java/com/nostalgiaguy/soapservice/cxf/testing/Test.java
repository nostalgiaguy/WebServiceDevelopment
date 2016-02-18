/**
 * 
 */
package com.nostalgiaguy.soapservice.cxf.testing;

import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;

/**
 * @author nostalgiaguy
 *
 */

@WebService
@InInterceptors(interceptors = "com.nostalgiaguy.soapservice.cxf.testing.BasicAuthAuthorizationInterceptor")
public interface Test {

	String greet(String name);
}
