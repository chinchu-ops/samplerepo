package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=18;
if(age>18)
{
	System.out.println("age is valid)");
}
else
{
	throw new ArithmeticException("age below 18");
}
	}

}
