package org.day6_Assignment;
/**
 * @author Rishabh Ojha
 * @date   05/07/18
 *
 *	This class serves the purpose providing basic bank details 
 */
public abstract class Bank{
	Bank (double ballance){
		this.ballance = ballance;
	}//end of Parameterized constructor
	public double ballance;
}//end of Bank
