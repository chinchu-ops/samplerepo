package exceptionhandling;

public class Customexception {

	public static void main(String[] args) throws votingexception {
		// TODO Auto-generated method stub
		int age=18;
		if(age>18)
		{
			System.out.println("age is valid)");
		}
		else
		{
			throw new votingexception("age below 18");
		}
	}

}
