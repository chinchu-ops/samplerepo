package inheritance;

public class MultilevelSalary3 extends MultilevelSalary2{

	public static void main(String[] args) {
		MultilevelSalary3 obj1=new MultilevelSalary3();
		obj1.salary();
		obj1.salary1();
		obj1.salary2();
		

	}
	
	public void salary2()
	{
		int total=a-(hra+pf+b)+c;
		System.out.println(a+" is the Basic pay");
		System.out.println(b+" is the Deduction");
		System.out.println(hra+" is the HRA");
		System.out.println(pf+" is the PF");
		System.out.println(total+" is the total salary by hand");
	}

}
