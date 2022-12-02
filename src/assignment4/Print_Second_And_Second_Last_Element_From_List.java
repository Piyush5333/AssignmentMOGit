package assignment4;

import java.util.HashMap;

//This program print specific position elements

public class Print_Second_And_Second_Last_Element_From_List 
{

	public static void main(String[] args) 
	{

       HashMap<Integer,Integer> StoreMap = new HashMap<>();
        
       StoreMap.put(1, 10);
       StoreMap.put(2, 45);
       StoreMap.put(3, 90);
       StoreMap.put(4, 45);
       StoreMap.put(5, 23);
       StoreMap.put(6, 90);
       StoreMap.put(7, 44);
              
       System.out.println(StoreMap.get(2));
       System.out.println(StoreMap.get(6));
	}

}
