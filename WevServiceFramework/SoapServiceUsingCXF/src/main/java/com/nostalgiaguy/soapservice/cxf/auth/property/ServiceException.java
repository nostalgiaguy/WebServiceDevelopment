
package com.nostalgiaguy.soapservice.cxf.auth.property;

/**
 * @author nostalgiaguy
 *
 */

public class ServiceException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 856019139063683505L;
	
    protected String shortText;
    
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
	public ServiceException(String shortText) {
		super(shortText);
		this.shortText = shortText;
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
