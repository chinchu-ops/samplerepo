package superkeyword;

public class SuperVariableChild extends SuperVariable{
String colour="BLUE";
	public static void main(String[] args) {
		SuperVariableChild obj=new SuperVariableChild();
		obj.print();

	}
	public void print()
	{
		System.out.println(colour);
		System.out.println(super.colour);
		
	}

}
