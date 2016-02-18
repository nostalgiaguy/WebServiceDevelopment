
package com.nostalgiaguy.soapservice.cxf.auth.property;

/**
 * @author nostalgiaguy
 *
 */

public class ServiceException extends Exception {
	
	protected String errorType;
    protected String errorCode;
    protected String shortText;
    
    
	/**
	 * @return the errorType
	 */
	public String getErrorType() {
		return errorType;
	}

	/**
	 * @param errorType the errorType to set
	 */
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

	/**
	 * @param msg
	 * @param cause
	 */
	public ServiceException(String msg, Throwable cause) {
		super(msg, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param msg
	 */
	public ServiceException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public ServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param errorType
	 * @param errorCode
	 * @param shortText
	 */
	public ServiceException(String errorType, String errorCode, String shortText) {
		super(shortText);
		this.errorType = errorType;
		this.errorCode = errorCode;
		this.shortText = shortText;
	}

}
