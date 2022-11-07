package assignment2;

import java.util.Scanner;

public class Trainer 
{

	  int id = 0;
	  String name = null;
	  String department = null;
	  String email = null;
	  
	  
	  public static void main(String[] args) 
	  
	  {   
	
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Please Select details you want to see?");
		
		System.out.println("1)Trainer Details");
		
		System.out.println("2)Subject Details");
		
		int option = sc.nextInt();
		
		Trainer obj[] = Storedata();
		
	    UserInput(option, sc, obj);
		
	
	}

     //Store Data	  
		public static Trainer[] Storedata()
		{
		  Trainer obj[] = new Trainer[3];   	
		  obj[0] = new Trainer(1,"Mukesh","Testing","mukesh@gmail.com");
		  obj[1] = new Trainer(2,"Hitesh","WebDevelopment","mukesh@gmail.com");
		  obj[2] = new Trainer(3,"Mukesh","Devops","mukesh@gmail.com");
	      return obj;
		}

	//Constructor
	public Trainer(int Trainerid,String Trainername,String Trainerdepartment,String Traineremail)
	{
		id = Trainerid;
		name = Trainername;
	    department = Trainerdepartment;
	    email = Traineremail;
	        
	}
	
	//Reading User input
	public static void UserInput(int opt, Scanner SC,Trainer obj[])
	{
		int Id;
		System.out.println("Enter Trainer ID?");
		Id = SC.nextInt();	
		
		if(opt==1)
		{   
			
			GetTrainerdetails(Id,SC, obj);
		}
		else if(opt==2)
		{   
			GetSubjectDetails(Id, SC, obj);
		}	
	}
	
	
	//Get Trainer Details
	public static void GetTrainerdetails(int id,Scanner sc1,Trainer Trainer[])
	{
		
		for(int i = 0;i<Trainer.length;i++)
   		{
   			if(id == Trainer[i].id)
   			{
   				System.out.println("Trainer Details");
   			    System.out.println("Name:"+Trainer[i].name);
   			    System.out.println("Department:"+Trainer[i].department);
   			    System.out.println("EmailID:"+Trainer[i].id);
   			}	
   		}	
}
 		
		
	//Get Subject Details
	public static void GetSubjectDetails(int ID,Scanner sc1,Trainer Trainer[])
	{
        
		for(int i = 0;i<Trainer.length;i++)
       		{
       			if(ID == Trainer[i].id)
       			{
       				System.out.println("Subject Details");
       			    System.out.println("Subject Name:"+Trainer[i].department);
       			    System.out.println("Trainer Name:"+Trainer[i].name);
       			    System.out.println("Trainer Email ID:"+Trainer[i].email);
       			}	
       		}	
	}

}
