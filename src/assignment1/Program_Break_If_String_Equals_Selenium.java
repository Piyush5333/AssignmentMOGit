package assignment1;
//This program stops execution at string "Selenium" 
public class Program_Break_If_String_Equals_Selenium 
{
	public static void main(String[] args) 
	{
	   
		String str[] = {"Java","JavaScript","Selenium","Python","Mukesh"};
	   
	    System.out.println("Start Execution of Program");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
			if(str[i]=="Selenium")
			{
				System.out.println("Stop Execution of Program");	
			    break;
			}
		}
		
		
	}

}
