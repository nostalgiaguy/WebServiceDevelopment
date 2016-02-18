/**
 * 
 */
package com.nostalgiaguy.soapservice.cxf.auth.property;

import javax.jws.WebService;

/**
 * @author nostalgiaguy
 *
 */

@WebService
public interface TestAri {

	String greet(String name) throws ValidationException;
}
