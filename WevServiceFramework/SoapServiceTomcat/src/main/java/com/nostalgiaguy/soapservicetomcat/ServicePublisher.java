/**
 * 
 */
package com.nostalgiaguy.soapservicetomcat;

import javax.xml.ws.Endpoint;

/**
 * @author nostalgiaguy
 *
 */
public class ServicePublisher {

    public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8880/SoapServiceTomcat-0.0.1-SNAPSHOT/TestMethod", new TestMethodImplementation());
	   System.out.println("Service publishing done.");
    }
}
