import java.util.Scanner;
public class InputMenu 
{
	
    static Scanner input = new Scanner(System.in);
    
    //Declared as static for use in methods
    
	// Project Constructor and Variables
	static Project projectInfo;
	static String projectNumber, projectName, buildingType, physicalAddress, erfNumber, deadline;
    static double totalFee, amountPaid;
    static String completionDate = null;    
    static String finalised = "No";   
    static double amountDue = 0;

    
    // Person constructor and Variables
    static Person architect, contractor, customer;    
    
    static String nameArchitect, surnameArchitect, telNumberArchitect, emailAddressArchitect, personPhysicalAddressArchitect;
  
    static String nameContractor, surnameContractor, telNumberContractor, emailAddressContractor, personPhysicalAddressContractor;
    
    static String nameCustomer, surnameCustomer, telNumberCustomer, emailAddressCustomer, personPhysicalAddressCustomer;
    
    
	
    public static void display_menu() 
    {
	
		System.out.println("1 - Create a new project ");
		System.out.println("2 - Change due date of the project ");
		System.out.println("3 - Change total amount paid ");
		System.out.println("4 - Update Contractor's details ");
		System.out.println("5 - Finalise project ");
		System.out.println("6 - Exit ");
		System.out.print("\nSelection: ");
		
		
    }
	
    
	public static void createProject()
	{
				
		System.out.println ("You picked Create a new Project \n" );
    	
    	System.out.println ("Enter project number: " );
    	projectNumber = input.nextLine();
    	
    	System.out.println ("Enter project name: " );
    	projectName = input.nextLine();
    	
    	System.out.println ("Enter building type: " );
    	buildingType = input.nextLine();
    	
    	System.out.println ("Enter physical address: " );
    	physicalAddress = input.nextLine();
    	
    	System.out.println ("Enter ERF number: " );
    	erfNumber = input.nextLine();
    	
    	System.out.println ("Enter total fee R: " );
    	totalFee = input.nextDouble();
    	
    	System.out.println ("Enter amount paid: " );
    	amountPaid = input.nextDouble();
    	input.nextLine();
    	
    	System.out.println ("Enter project deadline: " );
    	deadline = input.nextLine();
    	
        projectInfo =  new Project(projectNumber, projectName, buildingType, physicalAddress, erfNumber, totalFee, amountPaid, deadline, completionDate, finalised, amountDue);
        
	}
	
	
	public static void createArchitect()
	{
				
		System.out.println ("\nEnter architect details " );
    	
    	System.out.println ("Enter architect name: " );
    	nameArchitect = input.nextLine();
    	
    	System.out.println ("Enter architect surname: " );
    	surnameArchitect = input.nextLine();
    	
    	System.out.println ("Enter architect contact number: " );
    	telNumberArchitect = input.nextLine();
    	
    	System.out.println ("Enter architect physical address: " );
    	personPhysicalAddressArchitect = input.nextLine();
    	
    	System.out.println ("Enter architect email address: " );
    	emailAddressArchitect = input.nextLine();
    	
    	architect = new Person(nameArchitect, surnameArchitect, telNumberArchitect, personPhysicalAddressArchitect, emailAddressArchitect);
    	System.out.println();
    	
    	
    	
	}
	
	public static void createContractor()
	{
				
		System.out.println ("\nEnter contractor details " );
    	
    	System.out.println ("Enter contractor name: " );
    	nameContractor = input.nextLine();
    	
    	System.out.println ("Enter contractor surname: " );
    	surnameContractor = input.nextLine();
    	
    	System.out.println ("Enter contractor contact number: " );
    	telNumberContractor = input.nextLine();
    	
    	System.out.println ("Enter contractor physical address: " );
    	personPhysicalAddressContractor = input.nextLine();
    	
    	System.out.println ("Enter contractor email address: " );
    	emailAddressContractor = input.nextLine();
    	
    	contractor = new Person(nameContractor, surnameContractor, telNumberContractor, personPhysicalAddressContractor, emailAddressContractor);
    	System.out.println();
    	
    	
	}
	
	public static void createCustomer()
	{
				
		System.out.println ("\nEnter customer details " );
    	
    	System.out.println ("Enter customer name: " );
    	nameCustomer = input.nextLine();
    	
    	System.out.println ("Enter customer surname: " );
    	surnameCustomer = input.nextLine();
    	
    	System.out.println ("Enter customer contact number: " );
    	telNumberCustomer = input.nextLine();
    	
    	System.out.println ("Enter customer physical address: " );
    	personPhysicalAddressCustomer = input.nextLine();
    	
    	System.out.println ("Enter customer email address: " );
    	emailAddressCustomer = input.nextLine();
    	
    	customer = new Person(nameCustomer, surnameCustomer, telNumberCustomer, personPhysicalAddressCustomer, emailAddressCustomer);
    	System.out.println();
    	
    	
    	
	}
	
	
	public static void changeDate()
	{
		
		System.out.println ( "You picked change due date " );	
    	System.out.println("The current due date is: " +deadline);
    	System.out.println("Enter a new due date: ");
    	deadline = input.nextLine();
    	
    	
    	projectInfo =  new Project(projectNumber, projectName, buildingType, physicalAddress, erfNumber, totalFee, amountPaid, deadline, completionDate, finalised,amountDue);
    	System.out.println("Due date has been changed to "+deadline);
    	System.out.println(projectInfo);
    	
	}
	
	
	public static void amountPaid()
	{
		
		System.out.println ( "You picked Change total amount paid " );	
    	System.out.println("The amount paid is: " +amountPaid);
    	System.out.println("Update total amount paid to: ");
    	amountPaid = input.nextDouble();
    	
    	
    	//Constructor recreates the object when a variable is changed
    	projectInfo =  new Project(projectNumber, projectName, buildingType, physicalAddress, erfNumber, totalFee, amountPaid, deadline, completionDate, finalised, amountDue);
    	System.out.println("Total amount paid has been changed to "+deadline);
    	System.out.println(projectInfo);
    	
	}
	
	
	public static void finaliseProject()
	{
		
		System.out.println ( "You picked finalise project " );	
		System.out.println ( "Enter completion date " );
		completionDate = input.nextLine();
		finalised = "Yes";
		amountDue = totalFee - amountPaid;
		
		
		// If project Name is empty, change it to House Customer's Surname
		if(projectName == "")
		{
			
			projectName = "House " + surnameCustomer;
		}
		
		
		projectInfo =  new Project(projectNumber, projectName, buildingType, physicalAddress, erfNumber, totalFee, amountPaid, deadline, completionDate, finalised, amountDue);
		System.out.println("The Project has been finalised ");
		
		
		if (amountDue > 0)
		{
			
			System.out.println("\nTax Invoice\n");
			System.out.println("Customer's Details: \n" + customer + "\n");
			System.out.println("Project Details: \n" +projectInfo + "\n");
			System.out.println("\nAmount Due : R" +amountDue + "\n");
			
		}
		
    	 	
    	
	}
	
	
    

	public static void main(String[] args) 
	{
		while (true) // Loop to keep the program running
		{
			
			display_menu();
			Scanner menuChoice = new Scanner(System.in);
			

	
			// Switch case for different functions based on user's choice
			switch (menuChoice.nextInt()) 
	
			{
	            
			case 1:
        	   
				createProject();
				createArchitect();
				createCustomer();
        	
				break;

       
			case 2:        
	    
				changeDate();
        	       	 
				break;
        
  
			case 3:
	    
				amountPaid();    
				break;
	    	
			case 4:
		    
				System.out.println ( "\nYou picked Update contractor's details " ); 
				System.out.println("The current contractors details : "+contractor +"\n");
				createContractor();
				break;
	    	
			case 5:
		    
				finaliseProject();    
	    	
				break;
				
			case 6:
			    System.out.println(" Exiting Program... Goodbye");
			    menuChoice.close();
			    input.close();
				System.exit(1);    
	    	
				break;
	    
			default:
	    
				System.err.println ( "Unrecognized option" );
				break;
	
        }
        
        
	}

}
}
/* References
 *  Chaitanya Singh
 * 
 * https://beginnersbook.com/2017/08/java-switch-case/
 */
