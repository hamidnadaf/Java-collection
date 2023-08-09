package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_ {

	public static void main(String[] args)
	{
         Vector vr=new Vector();
         vr.add(1);
         vr.add(2);
         vr.add(3);
         vr.add(4);
         vr.add(5);
         vr.add(6);
         vr.add(7);
         vr.add(8);
        System.out.println(vr); 
        System.out.println("using for loop");
        for(int i=0;i<=vr.size()-1;i++)
        {
        	System.out.println(vr.get(i));
        }
        System.out.println("using for each loop");

        for( Object a:vr)
        {
        	System.out.println(a);
        }
        System.out.println("using  Iterator");

        Iterator itr = vr.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println("using List Iterator");
        ListIterator itr2 = vr.listIterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
	
        }
        System.out.println(itr2.hasPrevious());
        System.out.println("using  Enumeration");

       Enumeration itr3 = vr.elements();
       while(itr3.hasMoreElements())
       {
    	   System.out.println(itr3.nextElement());
       }
	}

}
