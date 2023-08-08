package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_ {

	public static void main(String[] args)
	{
	 ArrayList <String> al =new ArrayList();
	 al.add("Kolhapur");
	 al.add("sangli");
	 al.add("satara");
	 al.add("pune");
	 al.add("Mumbai");
	 al.add("Nashik");
	 al.add(6,"Nagpur");
	 
System.out.println("=======Using for Loop========");
	 for(int i=0;i<al.size();i++)
	 {
		 System.out.println(al.get(i));
	 }

System.out.println("========Using for each Loop=======");
     for(String a:al)
     {
    	 System.out.println(a);
     }
     
System.out.println("========Using Itrator========");
     
      Iterator<String> it = al.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      
System.out.println("========Using ListItrator========");

      ListIterator<String> it1 = al.listIterator();
      while(it1.hasNext())
      {
    	  System.out.println(it1.next());
      }
      
      System.out.println("========Using ListItrator has privious ========");

      while(it1.hasPrevious())
      {
    	  System.out.println(it1.previous());
      }
      
      
     //  ListIterator<String> it3 = al.listIterator();
   //    while(it3.hasPrevious())
       {
    //	   System.out.println(it3.previous());
       }

	}

}
