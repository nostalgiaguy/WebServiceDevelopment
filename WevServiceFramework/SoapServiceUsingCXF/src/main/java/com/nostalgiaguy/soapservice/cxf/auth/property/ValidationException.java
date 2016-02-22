package com.nostalgiaguy.soapservice.cxf.auth.property;

/**
 * @author nostalgiaguy
 * 
 */

public class ValidationException extends Exception {

	private static final long serialVersionUID = 1L;
	protected String shortText;

	/**
	 * @param msg
	 * @param cause
	 */
	public ValidationException(String msg, Throwable cause) {
		super(msg, cause);
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
	public ValidationException(String shortText) {
		super( shortText);
		this.shortText = shortText;
	}
	
	/**
	 * @return the shortText
	 */
	public String getShortText() {
		return shortText;
	}

	/**
	 * @param shortText the shortText to set
	 */
	public void setShortText(String shortText) {
		this.shortText = shortText;
	}

}
