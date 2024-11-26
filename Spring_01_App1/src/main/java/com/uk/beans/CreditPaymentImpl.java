package com.uk.beans;

public class CreditPaymentImpl implements IPayment{
	
	public boolean doPayment(double billAmt) {
		System.out.println("Credit Card Payment");
		return true;
	}

}
