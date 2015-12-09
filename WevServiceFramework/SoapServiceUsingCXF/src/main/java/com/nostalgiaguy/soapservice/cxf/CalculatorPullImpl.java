package com.nostalgiaguy.soapservice.cxf;

import javax.jws.WebService;

@WebService
public class CalculatorPullImpl implements CalculatorPull{

	@Override
	public CalculatorRS getCalculator(CalculatorRQ calculatorRQ) {
		// TODO Auto-generated method stub
		
		int num_1=calculatorRQ.getValue_1();
		int num_2=calculatorRQ.getValue_2();
		
				
		CalculatorRS calculatorRS=new CalculatorRS(num_1+num_2,num_1-num_2,num_1*num_2);
		return calculatorRS;
	}

}
