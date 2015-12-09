package com.nostalgiaguy.soapservice.cxf;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CalculatorRQ")
public class CalculatorRS {
	


	private int addition;
	private int subtraction;
	private int multiply;
	
	public CalculatorRS(){
		
	}
	
	public CalculatorRS(int addition,int subtraction,int multiply){
		this.addition=addition;
		this.subtraction=subtraction;
		this.multiply=multiply;
	}

	public int getAddition() {
		return addition;
	}

	public void setAddition(int addition) {
		this.addition = addition;
	}

	public int getSubtraction() {
		return subtraction;
	}

	public void setSubtraction(int subtraction) {
		this.subtraction = subtraction;
	}

	public int getMultiply() {
		return multiply;
	}

	public void setMultiply(int multiply) {
		this.multiply = multiply;
	}
	
	@Override
	public String toString() {
		return "CalculatorRS [addition=" + addition + ", subtraction=" + subtraction + ", multiply=" + multiply + "]";
	}

}
