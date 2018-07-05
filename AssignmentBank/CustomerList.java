package org.day6_Assignment;
import java.util.*;
/**
 * @author Rishabh Ojha
 * @date   05/07/18
 *
 *	This class serves the purpose of creating the LinkedList of the Customer class's object 
 */
public class CustomerList {
	public static void main (String args[]){
		//Creating objects of Customer Class
		Customer cust1 = new Customer ("1", "Rishabh", "Pune", 1000.20);
		Customer cust2 = new Customer ("2", "Shubham", "Jabalpur", 1000.25);
		Customer cust3 = new Customer ("2", "Anmol", "Indore", 1000.26);
		Customer cust4 = new Customer ("2", "Arnab", "Bnagali", 1000.21);
		
		LinkedList <Customer> ourCustomers = new LinkedList <Customer> ();
		
		ourCustomers.add(cust1);
		ourCustomers.add(cust2);
		ourCustomers.add(cust3);
		ourCustomers.add(cust4);
		
		System.out.println("Following are the customers of the bank");
		//printing out the Customers of the Bank
		for (Customer cust: ourCustomers){
			System.out.println(cust);
		}//end of for-each
	}//end of main ()
}//end of CustomerList
