package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set<String>s=new HashSet<String>();
		s.add("Apple");
		s.add("Orange");
		s.add("Grapes");
		HashSet<String>s1=new HashSet<String>();
		s1.add("banana");
		s1.add("Lemon");
		System.out.println(s);
		System.out.println(s1);
		s1.addAll(s);
		System.out.println(s.addAll(s1));
		System.out.println(s.contains(s1));
		System.out.println(s.containsAll(s1));
		System.out.println(s.isEmpty());
		
		
		

	}

}
