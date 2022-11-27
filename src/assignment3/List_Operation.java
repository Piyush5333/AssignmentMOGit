package assignment3;

import java.util.ArrayList;
import java.util.List;
//This Program Perform List Operations
public class List_Operation {

	public static void main(String[] args) 
	{
		
      List<Integer> IntList1 = new ArrayList<>();
       
      IntList1.add(33);
      IntList1.add(44);
      IntList1.add(55);
      IntList1.add(66);
      IntList1.add(77);
      IntList1.add(88);
      
      System.out.println("Length of Current List:"+IntList1.size());
      
      //remove element using index
      IntList1.remove(2);
      
      //remove element using value
      IntList1.remove(Integer.valueOf(66));
      
      //add element 
      IntList1.add(3, 90);;
      
      //Display length of list after updation
      
      System.out.println("Length of List after updation:"+IntList1.size());
      
      System.out.println("Values present in List:");
      
      //Display all elements from list
      for(int i = 0; i<IntList1.size();i++)
      { 	  
         System.out.println(IntList1.get(i));
      }
    
      //Converted list into array
      Object[] obj = IntList1.toArray();
       
       System.out.println("Values present in Array:");
       for( Object obj1:obj)
       {
    	   System.out.println(obj1);
       }  
	}

}
