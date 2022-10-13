package assignment1;
//This program prints marks above eighty
public class Print_Marks 
{
  public static void main(String[] args) 
  {
	int marks[]= {78,12,89,55,35};
	
	for(int i=0;i<marks.length;i++)
	{
		if(marks[i]>80)
		{
			System.out.println("Marks scored above eighty: "+marks[i]);
		}
	}
  }
}
