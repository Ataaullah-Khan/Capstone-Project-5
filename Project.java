
public class Project 
{
	//Attributes
	
	String projectNumber;
	String projectName;
	String buildingType;
	String physicalAddress;
	String erfNumber;
	double totalFee;
	double amountPaid;
	String deadline;
	String completionDate;
	String finalised;
	double amountDue;
	
	
	public Project(String projectNumber, String projectName, String buildingType, String physicalAddress, String erfNumber, double totalFee, double amountPaid, String deadline,String completionDate, String finalised, double amountDue)
	{
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.physicalAddress = physicalAddress;
		this.erfNumber = erfNumber;
		this.totalFee = totalFee;
		this.amountPaid = amountPaid;
		this.deadline = deadline;
		this.completionDate = completionDate;
		this.amountDue = amountDue;
		
	}
	
	// Method
	public String toString()
	{
		String output = "Project Number: " + projectNumber;
		output += "\nProject Name: " + projectName;
		output += "\nBuilding Type:" + buildingType;
		output += "\nPhysical Address: " + physicalAddress;
		output += "\nERF Number: " + erfNumber;
		output += "\nTotal Fee: " + totalFee;
		output += "\nAmount Paid: " + amountPaid;
		output += "\nDeadline: " + deadline;

		
		return output;
	}
	

}
