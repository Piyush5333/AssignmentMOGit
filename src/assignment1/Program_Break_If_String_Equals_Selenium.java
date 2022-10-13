package assignment1;
//This program stops execution at string "Selenium" 
public class Program_Break_If_String_Equals_Selenium 
{
	public static void main(String[] args) 
	{
	   
		String str[] = {"Java","JavaScript","Selenium","Python","Mukesh"};
	   
	   for(String str1:str)
	   {
		   if(str1.equals("Selenium"))
		   {
			   System.out.println("Stop Execution of Program At String: "+str1);
		   }  
	   }
	}

}
