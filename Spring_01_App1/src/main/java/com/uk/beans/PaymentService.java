package com.uk.beans;

public class PaymentService {
	
	private IPayment payment;
	
	public void doProcess(double billAmt) {
		boolean status = payment.doPayment(billAmt);
		if(status)
			System.out.println("Print Receipt......");
		else
			System.out.println("Something Error....");
	}
	
}
