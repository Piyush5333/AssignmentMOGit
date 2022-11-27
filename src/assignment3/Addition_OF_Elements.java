package assignment3;

import java.util.ArrayList;
import java.util.List;

//This program performs addition of elements from list
public class Addition_OF_Elements {

	public static void main(String[] args) 
	{
		int sum=0;
		List<Integer> List1 = new ArrayList<>();
		
		List1.add(100);
		List1.add(200);
		List1.add(300);
		List1.add(400);
		
		for(int i = 0; i<List1.size();i++)
		{			
			sum=sum+List1.get(i);	
		}
          
		System.out.println("Sum of ListElement"+sum);
	}

}
