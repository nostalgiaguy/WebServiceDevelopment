package com.nostalgiaguy.soapservicetomcat;


import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface TestMethod {
		
	@WebResult(name="AdditionResult")
	String addition(@WebParam(name="IntegerInput_1")int a,@WebParam(name="IntegerInput_2")int b);
	
	@WebResult(name="SubtractionResult")
	int subtraction(@WebParam(name="IntegerInput_1")int a,@WebParam(name="IntegerInput_2")int b);
	
	@WebResult(name="MultiplyResult")
	int multiply(@WebParam(name="IntegerInput_1")int a,@WebParam(name="IntegerInput_2")int b);

	List<Integer> calculator(@WebParam(name="IntegerInput_1")int a,@WebParam(name="IntegerInput_2")int b);

}
