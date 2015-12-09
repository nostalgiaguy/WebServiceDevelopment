package com.nostalgiaguy.soapservice.cxf.cxfclient;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nostalgiaguy.soapservice.cxf.CalculatorPull;
import com.nostalgiaguy.soapservice.cxf.CalculatorRQ;
import com.nostalgiaguy.soapservice.cxf.CalculatorRS;


public final class Client {

    public Client() {
    }

    public static void main(String args[]) throws Exception {
         ClassPathXmlApplicationContext context 
            = new ClassPathXmlApplicationContext(new String[] {"com.nostalgiaguy.soapservice.cxf.cxfclient/client-beans.xml"});

         CalculatorPull client = (CalculatorPull) context.getBean("orderClient");
         int p1=8;
         int p2=5;
         CalculatorRQ calculatorRQ=new CalculatorRQ();
         calculatorRQ.setValue_1(p1);
         calculatorRQ.setValue_2(p2);
         
         CalculatorRS result=client.getCalculator(calculatorRQ);
         
         //String magic=result.toString();
         
         String message = (result == null) ? "something failed" : result.toString();
		 System.out.println(message.toString());
            
    }
}
