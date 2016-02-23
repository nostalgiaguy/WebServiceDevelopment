/**
 * 
 */
package com.nostalgiaguy.soapservice.cxf.auth.property;

/**
 * @author nostalgiaguy
 *
 */

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.ws.security.WSPasswordCallback;

public class PullPasswordCallBack implements CallbackHandler {

	static Logger logger = LogManager.getLogger(PullPasswordCallBack.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.security.auth.callback.CallbackHandler#handle(javax.security.auth
	 * .callback.Callback[])
	 */
	@Override
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {

		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
		logger.debug("Identifier from request {}", pc.getIdentifier());
		if (pc.getIdentifier() != null && !pc.getIdentifier().trim().isEmpty()) {
			pc.setPassword(getPassword(pc.getIdentifier()));
			ASPThreadLocal.setUserName(pc.getIdentifier());
		}

	}

	public String getPassword(String userName) {
		return getLoginDetails(userName);
	}

	public String getLoginDetails(String userName) {
		LoginBeanDao loginBean = (LoginBeanDao) SpringApplicationContext.getBean("edao");
		String passWord = null;
		if (loginBean != null) {
			passWord = loginBean.getLoginPassword(userName);
		}
		return passWord;
	}

}

/*
 * public String getLoginUserName() { LoginBean loginBean =
 * (LoginBean)SpringApplicationContext.getBean("_loginBean"); String
 * userName=null; if(loginBean != null){ userName=loginBean.getUserName(); }
 * logger.debug("Inside getLoginUserName()"); return userName; }
 * 
 * public String getLoginPassWord() { LoginBean loginBean =
 * (LoginBean)SpringApplicationContext.getBean("_loginBean"); String
 * passWord=null; if(loginBean != null){ passWord=loginBean.getPassWord(); }
 * logger.debug("Inside getLoginPassWord()"); return passWord; }
 */
