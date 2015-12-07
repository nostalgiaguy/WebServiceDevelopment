package com.nostalgiaguy.soapservicetomcat;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;


@WebService(endpointInterface="com.nostalgiaguy.soapservicetomcat.TestMethod",
portName="testMethodPort",
serviceName="testMethod")
public class TestMethodImplementation implements TestMethod{

	public int addition(int a, int b) {
		return a+b;
	}

	public int subtraction(int a, int b) {
		return a-b;
	}

	public int multiply(int a, int b) {
		return a*b;
	}

//	@Override
//	public List<Integer> calculator(int a, int b) {
//		List<Integer> result = new ArrayList<>();
//		//result.add(new Add(a,b).getAddition());
//		//result.add(new Sub(a,b).getSubtraction());
//		result.add(a+b);
//		result.add(a-b);
//		result.add(a*b);
//		return result;
//	}

//	@Override
//	public int multiply(int a, int b) {
//
//		return a*b;
//	}

}


/*
 * @javax.jws.WebService(
        serviceName = "CalculatorPull",
        portName = "CalculatorPullSOAP",
        targetNamespace = "com.nostalgiaguy",
        wsdlLocation = "CalculatorPull.wsdl",
        endpointInterface = "com.nostalgiaguy.CalculatorPull")
        
        
        */
