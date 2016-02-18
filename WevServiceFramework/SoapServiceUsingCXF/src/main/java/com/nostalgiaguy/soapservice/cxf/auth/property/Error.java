/**
 * 
 */
package com.nostalgiaguy.soapservice.cxf.auth.property;

/**
 * @author nostalgiaguy
 * 
 */
public final class Error {

	/**
	 * As it is utility class so it should not have a public or default
	 * constructor.
	 */
	private Error() {
	}

	public static enum ErrorDescription {

		WRONG_CREDENTIALS {
			public String toString() {
				return "Wrong Access Information";
			}
		}
	}

}
