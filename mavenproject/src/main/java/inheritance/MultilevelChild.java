package inheritance;

public class MultilevelChild extends MultilevelParentB {

	public static void main(String[] args) {
		MultilevelChild obj=new MultilevelChild();
		obj.add();
		obj.sub();
		obj.div();

	}
	public void div()
	{
		int a=10;
		int b=5;
		int c=a/b;
		System.out.println(c+" is the division");
	}

}


