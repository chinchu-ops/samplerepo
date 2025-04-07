package inheritance;

public class HierarchicalChild1 extends HierarchicalParent {

	public static void main(String[] args) {
		
		HierarchicalChild1 obj1=new HierarchicalChild1();
		obj1.print();
		obj1.print2();
		
	}
public void print2()
{
	System.out.println("hello");
}
}
