package inheritance;

public class Singlechild extends Singleparent{

	public static void main(String[] args) {
		
		Singlechild obj=new Singlechild();
		obj.display();
		obj.display1();
	}
public void display1()
{
	System.out.println("World");
}
}
