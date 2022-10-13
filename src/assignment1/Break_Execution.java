package assignment1;
//This program breaks execution if it finds 85 number
public class Break_Execution 
{
  public static void main(String[] args) 
  {
	 int number[]= {12,34,66,85,900};
     
	 for(int num:number)
	 {   System.out.println(num);
		 if(num == 85)
		 {   
			 System.out.println("Program Execution Break At:"+num);
			 break;
		 }		 
	 }	 
    
  }
}
