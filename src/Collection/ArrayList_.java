package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_ {

	public static void main(String[] args)
	{
		ArrayList <String> al=new ArrayList();
		al.add("Mango");
		al.add("Papaya");
		al.add("Banana");
		al.add("Pinaple");
		al.add("apple");
		al.add("Orange");
		System.out.println(al);
		
		System.out.println("++++forLoop++++");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
    	}
		
		System.out.println("++++forEachLoop++++");
		for(String a:al)
		{
			System.out.println(a);
		}
		
		System.out.println("+++++Iterator+++++");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
				{
			System.out.println(itr.next());
				}
		System.out.println("+++++ListIterator+++++");
		ListIterator<String> itr2 = al.listIterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		System.out.println("+++++PriviousListIterator+++++");
		{
			while(itr2.hasPrevious())
			System.out.println(itr2.previous());
		}
	}

}
