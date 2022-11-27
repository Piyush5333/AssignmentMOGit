package assignment3;

import java.util.Arrays;
import java.util.List;

//This Program takes value from array and store in list
public class Pick_Values_From_Array_And_Store_In_List {

	public static void main(String[] args) 
	{
		
		
		List<String> Storelist = Arrays.asList("Java","Selenium","Javascript","Cypress");
         System.out.println("Values from Array Displayed in List:");
		 for(String Displaylist:Storelist)
          {
        	  System.out.println(Displaylist);
          }  
         
	}

}
