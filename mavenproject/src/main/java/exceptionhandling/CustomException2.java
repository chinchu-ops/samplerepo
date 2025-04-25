package exceptionhandling;

public class CustomException2 {

	public static void main(String[] args) throws LicenceException {
		int a=80;
		if(a<65)
		{
			System.out.println("eligible for licence");
		}
		else
		{
			throw new LicenceException("senior citizen");
		}

	}

}
