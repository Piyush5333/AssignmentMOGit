package assignment4;

import java.util.ArrayList;
import java.util.List;

//This program prints string in reverese order

public class Print_List_In_Reverse_Order 
{

	public static void main(String[] args) 
	{
       List<String> list = new ArrayList<>();
       list.add("java");
       list.add("selenium");
       list.add("TestNG");
       list.add("Git");
       list.add("Github");
       System.out.println(reverseorder(list));
	}
	
//This method store value in reverseorder	
	public static List<String> reverseorder(List<String> list)
	{
		
		List<String> reverseorderlist = new ArrayList<>();
		
		String Str;
		
		for(int i = 4;i>=0;i--)
	    {
	      	Str = list.get(i);
	    	reverseorderlist.add(Str);
	    }	
		
		return reverseorderlist;
	}

}
