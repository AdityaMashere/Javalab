package setss;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;

public class set {

	public static void main(String[] args) {
	 
		Set<String> set1 =new HashSet<String>();
		
		set1.add("Aditya");
		set1.add("Siddhesh");
		set1.add("Lokesh");
		set1.add("Vedant");
		System.out.println("Set Elements" +set1);
		
Set<String> set2 = new HashSet<String>();
		
		set2.add("Raj");
		set2.add("Saurabh");
		
		set1.addAll(set2);
		System.out.println("Set:" +set1);
		
		set1.remove("Raj");
		System.out.println("Set after removal of elements:" +set1);
		
		Set<Integer> a=new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		System.out.println("Integer Set a:" +a);
		
		Set<Integer> b=new HashSet<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(40);
		b.add(50);
		b.add(60);
		System.out.println("Integer Set b:" +b);
		
		Set<Integer> union= new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println("Union of sets a and b is:");
		System.out.println(union);
		
		Set<Integer> intersection= new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.println("Intersection of sets a and b is:");
		System.out.println(intersection);
		
		Set<Integer> difference= new HashSet<Integer>(a);
		intersection.removeAll(b);
		System.out.println("Difference of sets a and b is:");
		System.out.println(difference);
	
		
//------------------------------------------------------------------------------------		
		LinkedList<String> list = new LinkedList<>();

		list.add("Aditya");

		list.add("Vedant");

		list.add("Siddhesh");

		list.add("Sarang");

		list.add("Rushi");

		list.add("Lokesh");

		LinkedList<String> list2 = new LinkedList<>();

		list.add("Mashere");

		list.add("Takalkar");

		list.add("Sonawane");

		list.add("Kadam");

		list.add("Magadum");

		list.add("Meshram");

		list.addAll(list2);
                                                                                                                    
		Iterator<String> itr = list.iterator();

		while (itr.hasNext())

		{

			System.out.println(itr.next());

		}
	
	}

}




//------------------------------------------------------------------------------------------------

//
//public class ll {
//	public static void main(String[] args) {
			