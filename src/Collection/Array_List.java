package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List {

	public static void main(String[] args) 
	{
        ArrayList <Object> al=new ArrayList();
        al.add("Hamid");
        al.add("Nadaf");
        al.add("like");
        al.add("bhilawadi");
        al.add(8374748);
        al.add('m');
        
        System.out.println(al);
        System.out.println("======for Loop=======");
        for(int i=0;i<al.size();i++)
        {
        	System.out.println(al.get(i));
        }
        System.out.println("====for each loop====");
        
        for(Object a:al)
        {
        System.out.println(a);
        }
        
        System.out.println("====iterator=====");
        ListIterator<Object> itr = al.listIterator();
        while(itr.hasNext())
        		{
        	System.out.println(itr.next());
        		}
        
        System.out.println(("====listiterator===="));
        ListIterator<Object> itr1 = al.listIterator();
        while(itr1.hasNext())
        {
        	System.out.println(itr1.next());
        }
        while(itr1.hasPrevious())
        {
        	System.out.println(itr1.previous());
        }
       
	}

}
