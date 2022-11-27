package assignment3;

import java.util.ArrayList;
import java.util.List;

//This Program Stores and Print Integer values
public class Store_And_Print_Integer_List {

	public static void main(String[] args) 
	{
	    List<Integer> Listint = new ArrayList<Integer>();
	    Listint.add(10);
	    Listint.add(20);
	    Listint.add(30);
	    Listint.add(40);
	    Listint.add(50);
	    
	    System.out.println("Below is current Integer List");
	 
	    for(int i = 0; i<Listint.size();i++)
	    { 
	    	System.out.println(Listint.get(i));
	    } 	
	}

}
