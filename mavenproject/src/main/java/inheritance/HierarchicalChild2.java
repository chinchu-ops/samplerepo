package inheritance;

public class HierarchicalChild2 extends HierarchicalParent {

	public static void main(String[] args) {
		HierarchicalChild2 obj=new HierarchicalChild2();
		obj.print();
		
		obj.add();
	}
	public void add()
	{
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println(c);
	}
}
