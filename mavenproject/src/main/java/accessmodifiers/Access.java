package accessmodifiers;

public class Access {

	public static void main(String[] args) {
		
		Access obj=new Access();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();
	}
	public void display()
	{
		System.out.println("public");
	}
	private void display1()
	{
		System.out.println("private");
		
	}
	protected void display2()
	{
		System.out.println("protected");
	}
	void display3()
	{
		System.out.println("default");
	}
}
