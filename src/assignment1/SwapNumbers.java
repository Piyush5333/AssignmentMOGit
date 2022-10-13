package assignment1;
//This program swap number
public class SwapNumbers 
{
   public static void main(String[] args) 
  {
	   
	 int a = 10;
	 int b = 20;
	 
	 System.out.println("Value of a before swap :"+a);
	 System.out.println("Value of b before swap :"+b);
	 System.out.println("---------------------------");
	 b = b - a;
	 a = a + b;
	 System.out.println("Value of a after swap :"+a);
	 System.out.println("Value of b after swap :"+b);
	 System.out.println("---------------------------");
  }
}
