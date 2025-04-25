package interfaceexample;

public class InterfaceChild1 implements Interface1{

	public static void main(String[] args) {
		//InterfaceChild1 obj=new InterfaceChild1();
		Interface1 ref=new InterfaceChild1();
		ref.sub();
		ref.sum();
		//obj.print();
		//obj.sub();
		//obj.sum();

	}
	public void print()
	{
		System.out.println("hai");
	}
	@Override
	public void sum() {
		int a=5;
		int b=2;
		int c=a+b;
		System.out.println(c+" sum  ");
		
	}
	@Override
	public void sub() {
		
		int a=5;
		int b=2;
		int c=a-b;
		System.out.println(c+" diff ");
		
	}

}
