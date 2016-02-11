package com.nostalgiaguy.soapservicetomcat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebService(endpointInterface = "com.nostalgiaguy.soapservicetomcat.TestMethod", portName = "testMethodPort", serviceName = "testMethod")
public class TestMethodImplementation implements TestMethod {

	static Logger log = LogManager.getLogger(TestMethodImplementation.class
			.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nostalgiaguy.soapservicetomcat.TestMethod#addition(int, int)
	 * 
	 * addition service is using header authorization.
	 */
	public String addition(int a, int b) {
		log.info("Entering into additon service");
		boolean test = authorizationTest();
		if (test) {
			log.info("Valid user");
			return Integer.toString(a + b);
		} else {
			log.info("Invalid user");
			return "Invalid User";
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nostalgiaguy.soapservicetomcat.TestMethod#subtraction(int, int)
	 */
	public int subtraction(int a, int b) {
		return a - b;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nostalgiaguy.soapservicetomcat.TestMethod#multiply(int, int)
	 */

	public int multiply(int a, int b) {
		return a * b;
	}

	/*
	 * (non-Javadoc)
	 * @see com.nostalgiaguy.soapservicetomcat.TestMethod#calculator(int, int)
	 */
	public List<Integer> calculator(int a, int b) {
		List<Integer> result = new ArrayList<>();
		result.add(a + b);
		result.add(a - b);
		result.add(a * b);
		return result;
	}

	@Resource
	private static WebServiceContext wsc;

	/*
	 * This method is validating username and password from header of the
	 * request.
	 */
	public static boolean authorizationTest() {
		MessageContext mc = wsc.getMessageContext();
		Map requestHeader = (Map) mc.get(MessageContext.HTTP_REQUEST_HEADERS);
		List userList = (List) requestHeader.get("Username");
		List passList = (List) requestHeader.get("Password");
		String username = "";
		String password = "";
		if (passList != null && userList != null) {
			username = (String) userList.get(0);
			password = (String) passList.get(0);
		}
		if ("shubham".equals(username) && "pathak".equals(password)) {
			return true;
		} else {
			return false;
		}
	}

}
