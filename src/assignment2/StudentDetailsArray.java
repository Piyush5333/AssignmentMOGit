package assignment2;

import java.util.Scanner;

//This Program store and read Student details
public class StudentDetailsArray 
{

	int ID = 0;
	String name = null;
	String email = null;
	long phone = 0l;
	String add = null;
	String status = null;
		
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter total Number of Students which needs to be stored");
		
		int no = sc.nextInt();
	
		StudentDetailsArray obj=new StudentDetailsArray();
		
	    StudentDetailsArray StudDetailsArray[] = obj.StoreStudentsDetails(no,sc);
		
		obj.GetStudentDetails(sc, StudDetailsArray);
			
	}
	  
	
	public StudentDetailsArray[] StoreStudentsDetails(int no,Scanner sc)
	{  
		StudentDetailsArray Student[] = new StudentDetailsArray[no]; ; 
		
		for(int i=0;i<no;i++)
		{   
			StudentDetailsArray Stud = new StudentDetailsArray();	
	    	System.out.println("Enter ID of Student");
			Stud.ID = sc.nextInt();
	    	System.out.println("Enter Name of Student");
			Stud.name=sc.next();
			System.out.println("Enter Address of Student");
			Stud.add =sc.next();
			System.out.println("Enter EmailID of Student");
			Stud.email =sc.next();
			System.out.println("Enter Phone No of Student");
			Stud.phone =sc.nextLong();
			System.out.println("Enter Status of Student");
			Stud.status =sc.next();		
		    Student[i] = Stud;
		}
		
		return Student;
	}			
	
	 
	public void GetStudentDetails(Scanner Sc,StudentDetailsArray Student[])
	{
		 System.out.println("Please Enter ID of Student which needs to be searched?"); 
		  
		  int SerachedID = Sc.nextInt(); 
		  
		  for(int i = 0;i<Student.length;i++) 
		  { 
			  if(SerachedID == Student[i].ID )
				  
    		  { 
				  System.out.println("Students Details:");
				  System.out.println("ID:"+Student[i].ID);
				  System.out.println("Name:"+Student[i].name);
				  System.out.println("Address:"+Student[i].add);
				  System.out.println("Phone No:"+Student[i].phone);
				  System.out.println("Email ID:"+Student[i].email);
		         break; 
		       } 
		     
		  }
		 	
	
	}
   
}
