package aggregation;

public class AggregationChild {
	String city;
	String state;
	AggregationParent ref;

	public static void main(String[] args) {
		AggregationParent obj=new AggregationParent("chinchu", 25,"ekm" );
		AggregationChild obj1=new AggregationChild("koothattululam","kerala",obj);
       obj1.display();
	}
	public AggregationChild(String city,String state,AggregationParent ref)
	{
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	public void display() {
		System.out.println( ref.name+" "+ ref.rollnumber+" "+city+" "+ state);
	}

}
