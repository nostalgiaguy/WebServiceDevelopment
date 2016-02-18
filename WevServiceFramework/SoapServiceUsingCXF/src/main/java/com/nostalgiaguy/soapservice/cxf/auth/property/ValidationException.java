package com.nostalgiaguy.soapservice.cxf.auth.property;

/**
 * @author nostalgiaguy
 * 
 */

public class ValidationException extends ServiceException {

	/**
	 * @param msg
	 * @param cause
	 */
	public ValidationException(String msg, Throwable cause) {
		super(msg, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param msg
	 */
	public ValidationException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public ValidationException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param errorType
	 * @param errorCode
	 * @param shortText
	 */
	public ValidationException(String errorType, String errorCode,
			String shortText) {
		super( shortText);
		// TODO Auto-generated constructor stub
	}

}
