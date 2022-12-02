package assignment4;

import java.util.ArrayList;
import java.util.List;

//This Program stores list as element into main list

public class Store_List_As_Element 
{

	public static void main(String[] args) 
	{
	   List<List<Integer>> InputList = new ArrayList<>();
	   List<Integer> List1 = new ArrayList<>();
	   List<Integer> List2 = new ArrayList<>();
	   List<Integer> List3 = new ArrayList<>();
	   
	   List1.add(11);
	   List1.add(22);
	   List1.add(33);
	   
	   List2.add(9);
	   List2.add(19);
	   List2.add(29);

	   List3.add(7);
	   List3.add(17);
	   List3.add(27);
	   
	   InputList.add(List1);
	   InputList.add(List2);
	   InputList.add(List3);
	   
	   System.out.println(InputList);
	   
	}

}
