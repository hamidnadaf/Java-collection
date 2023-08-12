package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List {

	public static void main(String[] args) {

		LinkedList <Object> ll=new LinkedList();
		ll.add("john");
		ll.add("jony");
		ll.add("janardhan");
		ll.add("ram");
		ll.add("rahim");
		ll.add("rahemaan");
		
		System.out.println(ll);
		System.out.println("===for loop===");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("===for Eachloop===");
		for(Object a:ll)
		{
			System.out.println(a);
		}
		System.out.println("===iterator===");
		Iterator<Object> itr = ll.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println("===Listiterator loop===");
		ListIterator<Object> itr1 = ll.listIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println(itr1.hasPrevious());
		
	}

}
