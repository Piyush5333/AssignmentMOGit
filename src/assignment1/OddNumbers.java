package assignment1;

public class OddNumbers 
{
   public static void main(String[] args) 
   { 
	  int counter=0; 
	   System.out.println("Below are Odd numbers from 1 to 50:");
	 
	   for(int i=1;i<=50;i++)
	 {  
		 
		 if(i%2!=0)
		  {
			  System.out.println(i);
			  counter++;
		  }	  
	 }	 
	   System.out.println("Total Odd Number between 1 to 50: "+counter);
   }
}
