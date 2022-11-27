package assignment3;

import java.util.ArrayList;
import java.util.List;

//This Program verify specific string is present in list or not

public class Store_String_List_And_Check_Value_In_List 
{

	public static void main(String[] args)
	{
		
		
		List<String> StrList = new ArrayList<>();
		StrList.add("Web Automation");
		StrList.add("API Automation");
		StrList.add("Mobile Automation");
			
		
		
		
		for(int i=0;i<StrList.size();i++)
		{
			
			if(StrList.contains("Mobile Automation"))
			{
			   System.out.println("True");	
			   break;
			}	
		}
		 	
			  
		
		}	
	
	
		

	}


