package com.nostalgiaguy.soapservice.cxf;

import javax.jws.WebService;

@WebService
public interface CalculatorPull {
	
	CalculatorRS getCalculator(CalculatorRQ calculatorRQ);

}
