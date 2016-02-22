/**
 * 
 */
package com.nostalgiaguy.soapservice.cxf.auth.property;

/**
 * @author nostalgiaguy
 *
 */
public class LoginBean {
	
	private String userName;
	private String passWord;
	
	public LoginBean(){};
	
	public LoginBean(String userName ,String passWord){
		this.userName=userName;
		this.passWord=passWord;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public String getPassWord(){
		return passWord;
	}
	
	public String toString(){
		return "Username:"+userName+" , Password:"+passWord;
	}

}
