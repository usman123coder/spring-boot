package com.uk.beans;

public class DebitPaymentImpl implements IPayment{
	
	public boolean doPayment(double billAmt) {
		System.out.println("Debit card Payment");
		return true;
	}

}
