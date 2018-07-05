package org.day6_Assignment;
/**
 * @author Rishabh Ojha
 * @date   05/07/18
 *
 *	This class serves the purpose of providing the Customer details 
 */
public class Customer extends Bank {
	String accountNo, custName, custAddress;
	public Customer(String accountNo, String custName, String custAddress, double ballance) {
		super(ballance);
		this.accountNo = accountNo;
		this.custName = custName;
		this.custAddress = custAddress;
	}//end of parameterized constructor
	
	@Override
	public String toString (){
		return "\n\nCustomer Account Number: " + accountNo + "\nCustomer Name: " + custName+
					"\nCustomer Account Ballance: " + ballance + "\nCustomer Address: " + custAddress;
	}//end of override toString()
}//end of Customer
