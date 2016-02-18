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

		String user = "shubham";
		String pwd = "pathak";

		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
		logger.debug("Identifier from request {}", pc.getIdentifier());
		if (pc.getIdentifier() != null && !pc.getIdentifier().trim().isEmpty()
				&& user.equals(pc.getIdentifier())) {
			pc.setPassword(pwd);
			ASPThreadLocal.setUserName(pc.getIdentifier());
		}

		else {
			pc.setPassword(pc.getIdentifier());
		}

	}
}
