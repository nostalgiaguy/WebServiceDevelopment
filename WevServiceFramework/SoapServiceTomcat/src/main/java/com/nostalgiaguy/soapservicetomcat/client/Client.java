/**
 * 
 */
package com.nostalgiaguy.soapservicetomcat.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import com.nostalgiaguy.soapservicetomcat.TestMethod;

/**
 * @author nostalgiaguy
 * 
 */
public final class Client {

	public Client() {
	}

	private static final String WS_URL = "http://localhost:8880/SoapServiceTomcat-0.0.1-SNAPSHOT/TestMethod?wsdl";

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL(WS_URL);
		QName qname = new QName("http://soapservicetomcat.nostalgiaguy.com/",
				"testMethod");
		Service service = Service.create(url, qname);
		TestMethod test = service.getPort(TestMethod.class);
		Map<String, Object> requestContext = ((BindingProvider) test)
				.getRequestContext();
		requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);
		Map<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put("Username", Collections.singletonList("shubham"));
		headers.put("Password", Collections.singletonList("pathak"));
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		test.addition(51, 6);
	}

}
