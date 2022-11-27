package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//This program display elements using iterator 
public class Print_Values_Using_Iterator_Loop 
{
    public static void main(String[] args) 
    {
	   List<Integer> IntList = new ArrayList<>();	
	   
	   IntList.add(10);
	   IntList.add(20);
	   IntList.add(30);
	   IntList.add(40);
	   IntList.add(50);
	   
	   Iterator<Integer> Itr= IntList.iterator();
	   
	   System.out.println("Numbers from list:");
	   
	   while(Itr.hasNext())
	   {
		  Integer no = Itr.next();
		  
		  System.out.println(no);
	   }  
	}
}
