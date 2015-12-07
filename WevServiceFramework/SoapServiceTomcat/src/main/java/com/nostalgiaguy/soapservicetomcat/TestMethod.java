package com.nostalgiaguy.soapservicetomcat;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface TestMethod {
	
	//int multiply(int a,int b);
	
	//List<Integer> calculator(int a,int b);
	
	int addition(int a,int b);
	int subtraction(int a,int b);
	int multiply(int a,int b);

}
