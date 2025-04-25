package abstraction;

public class AbstractChild extends AbstractionParent {

	public static void main(String[] args) {
		//AbstractChild obj=new AbstractChild();
		AbstractionParent obj=new AbstractChild();//ref for parent so cant call child only call parent
		obj.display();
		obj.sum();
		//obj.print();

	}

	@Override
	public void display() {
		System.out.println("abstract body");
		
	}
	public void print()
	{
		System.out.println("c");
	}

}
