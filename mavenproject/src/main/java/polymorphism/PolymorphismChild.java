package polymorphism;

public class PolymorphismChild extends PolymorphismParent{

	public static void main(String[] args) {
		
		PolymorphismChild obj=new PolymorphismChild();
		obj.sum(5, 2);

	}
	public void sum(int a,int b)
	{
		int c=a-b;
		System.out.println(c+" child sum");
		super.sum(5, 3);
	}


}
