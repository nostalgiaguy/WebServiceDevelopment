package com.nostalgiaguy.soapservice.cxf.auth.property;

import javax.jws.WebService;
import javax.xml.ws.soap.Addressing;

import org.apache.logging.log4j.LogManager;

/**
 * @author nostalgiaguy
 * 
 */

@WebService
@Addressing(enabled = true, required = false)
public class TestAriImpl implements TestAri {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nostalgiaguy.soapservice.cxf.testing.Test#greet(java.lang.String)
	 */

	static org.apache.logging.log4j.Logger LOG = LogManager
			.getLogger(TestAriImpl.class);

	@Override
	public String greet(String name) throws ValidationException {
		// TODO Auto-generated method stub

		String userName = ASPThreadLocal.getUserName();
		LOG.info(userName);
		try {
			if (userName != null) {
				return "my name is " + name;
			}
			throw new ValidationException(
					Error.ErrorDescription.WRONG_CREDENTIALS.toString());
		} catch (Exception e) {

			throw new ValidationException(
					Error.ErrorDescription.WRONG_CREDENTIALS.toString());
		}
	}

}
