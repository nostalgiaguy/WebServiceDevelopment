/**
 * 
 */
package com.nostalgiaguy.soapservice.cxf.auth.property;

/**
 * @author nostalgiaguy
 *
 */
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;
import java.util.Map;
import org.apache.cxf.message.Message;
import org.apache.cxf.helpers.CastUtils;


public class WSSecurityInterceptor extends WSS4JInInterceptor {
	
	static Logger logger = LogManager.getLogger(WSSecurityInterceptor.class);
	/**
	 * This method validates the gives user credentials and throws the authentication exception in case of invalid credentials. Logs the Request Xml
	 * in case of a valid user credentials. In case of invalid credentials both the request and response will be logged in the log database.
	 * 
	 */
	public void handleMessage(SoapMessage msg) throws Fault {

		try {
			getProtocolHeaderDetails(msg);
			logger.info("called getHeaderDetails ");
			super.handleMessage(msg);
		} catch (Fault f) {

			logger.debug("UserName: {}", ASPThreadLocal.getUserName());
			logger.debug("Resetting the user name");
			ASPThreadLocal.removeUserName();
			logger.warn("authentication failed");
		}

	}
	/**
	 * This method reads protocol header from SOAP message 
	 * 
	 * 
	 */
	private void getProtocolHeaderDetails(SoapMessage msg) {
		logger.info("Inside getProtocolHeaderDetails ");
		Map<String, List<String>> reqHeaders = CastUtils.cast((Map<?, ?>) msg.get(Message.PROTOCOL_HEADERS));
		ASPThreadLocal.setHeader(reqHeaders.get("Authorization"));	
	    logger.debug("getProtocolHeaderDetails: {}", ASPThreadLocal.getHeader());
	            
	}

}
