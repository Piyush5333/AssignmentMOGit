package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Store_List_Values_Print_Using_For_Each_Loop 
{

	public static void main(String[] args) 
	{
          List<Integer> StoreList = new ArrayList<>();
          
          StoreList.add(10);
          StoreList.add(20);
          StoreList.add(30);
          StoreList.add(40);
          
          for(Integer DisplayList:StoreList)
          {
        	  System.out.println(DisplayList);
          }	  
          

	}

}
