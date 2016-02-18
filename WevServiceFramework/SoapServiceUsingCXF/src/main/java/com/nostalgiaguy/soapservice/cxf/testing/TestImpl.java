/**
 * 
 */
package com.nostalgiaguy.soapservice.cxf.testing;

import javax.jws.WebService;

/**
 * @author nostalgiaguy
 *
 */

@WebService
public class TestImpl implements Test {

	/* (non-Javadoc)
	 * @see com.nostalgiaguy.soapservice.cxf.testing.Test#greet(java.lang.String)
	 */
	@Override
	public String greet(String name) {
		// TODO Auto-generated method stub
		return "my name is "+name;
	}

}
