package exceptionhandling;

import java.rmi.AccessException;

public class ThrowExample2 {

	public static void main(String[] args) {
		int a=80;
		if(a<65)
		{
			System.out.println("eligible for licence");
		}
		else
		{
			throw new ArithmeticException("senior citizen");
		}
	}

}
