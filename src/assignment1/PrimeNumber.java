package assignment1;
//This Program calculates prime number from 1 to 1000
public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		int count=0;
		int counter=0;
		System.out.println("Below are Prime Number from 1 to 1000:");
       for(int i=1;i<=1000;i++)
       {   

    	   for(int j=2;j<i;j++)
    	   {	   
    	       if(i%j==0)
    	      {  
    	    	   count++;  
    	    	   break;  
    	      }
    	       
    	   }
    	   if(count==0 && i!=1)
    	   {	   
    		 counter++;  
    	   System.out.println(i);
    	   
    	   }
    	   else
    	   {	   
    	   count=0;
    	   }
       }
       System.out.println("Total count of prime number between 1 to 1000:"+counter);
	   
	}

}
