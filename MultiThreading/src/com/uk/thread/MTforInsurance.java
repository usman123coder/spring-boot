package com.uk.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MTforInsurance {
	public static void main(String[] args) {
		Customer c1 = new Customer("Usman", "PL101", 220000.00);
		Customer c2 = new Customer("Salman", "PL102", 220100.00);
		Customer c3 = new Customer("az", "PL103", 221000.00);
		Customer c4 = new Customer("rahul", "PL104", 200000.00);
		Customer c5 = new Customer("su", "PL105", 150000.00);
		Customer c6 = new Customer("jha", "PL106", 20000.00);
		
		List<Customer> cList = new ArrayList<>();
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		cList.add(c4);
		cList.add(c5);
		cList.add(c6);
	}
}
