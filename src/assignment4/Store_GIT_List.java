package assignment4;

import java.util.ArrayList;
import java.util.List;

//This program add element to outputlist which begins with Git

public class Store_GIT_List 
{
	static List<String> OutputList = new ArrayList<>();
	
	public static void main(String[] args) 
	{
		List<String> InputList = new ArrayList<>();		

		InputList.add("Git");
		InputList.add("Github");
		InputList.add("GitLab");
		InputList.add("GitBash");
		InputList.add("Selenium");
		InputList.add("Java");
		InputList.add("Mavan");

		StoreList(InputList);
	}
	
//This method add elements starting with "Git"
	public static  void StoreList(List<String> InputList) 
	{

		for (String Str : InputList) 
		{
			if (Str.startsWith("Git")) 
			{
				OutputList.add(Str);
			}

		}
		System.out.println(OutputList);
	}

}
