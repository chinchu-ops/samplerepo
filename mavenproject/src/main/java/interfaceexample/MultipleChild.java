package interfaceexample;

public class MultipleChild implements MultipleParentA,MultipleParentB{

	public static void main(String[] args) {
		MultipleChild obj=new MultipleChild();
		obj.display();
		obj.print();
	}

@Override
public void print() {
	
	System.out.println("hai");
}
@Override
public void display() {
	System.out.println("HELLO");
	
}
}
