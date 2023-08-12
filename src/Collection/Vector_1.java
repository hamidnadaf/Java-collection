package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {
        Vector v=new Vector();
        v.add("h");
        v.add("a");
        v.add("m");
        v.add("i");
        v.add("d");
        v.add("v");
        v.add("b");
        
        System.out.println(v);
        
        System.out.println("=====for loop=====");
        for(int i=0;i<v.size();i++)
        {
        	System.out.println(v.get(i));
        }
        System.out.println("=====for eachloop=====");
        for(Object a:v)
        {
        	System.out.println(a);
        }
        System.out.println("===== Iterrator=====");
        Iterator itr = v.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println("===== ListIterrator=====");
        ListIterator itr1 = v.listIterator();
         while(itr1.hasNext())
        	 System.out.println(itr1.next());
         System.out.println(itr1.hasPrevious());
        System.out.println("===== Enumaration=====");
        
        Enumeration enm = v.elements();
        while(        enm.hasMoreElements()
)        
    
        System.out.println(enm.nextElement());
	}

}
