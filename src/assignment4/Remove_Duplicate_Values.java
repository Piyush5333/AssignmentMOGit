package assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//This Program removes duplicate values
public class Remove_Duplicate_Values 
{

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();	
		list.add("Java");
		list.add("TestNG");
		list.add("Mavan");
		list.add("Java");
	
	   removeduplicatevalues(list);
	  
	}
	
	public static void removeduplicatevalues(List<String> list)
	{   
		HashSet<String> UniqueSet = new HashSet<>(list);
		System.out.println(UniqueSet);
	}

}
