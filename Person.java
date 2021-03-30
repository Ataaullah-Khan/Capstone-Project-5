
public class Person 
{
	//Attributes
	String name, surname, telNumber, emailAddress, personPhysicalAddress;
	
	public Person(String name, String surname, String telNumber, String emailAddress, String personPhysicalAddress)
	{
		this.name = name;
		this.surname = surname;
		this.telNumber = telNumber;
		this.emailAddress = emailAddress;
		this.personPhysicalAddress = personPhysicalAddress;
	}
	
	// Method
	public String toString()
	{
		String output = "Name: " +name;
		output += "\nSurname: " +surname;
		output += "\nContact Number: " +telNumber;
		output += "\nEmail Address: " +emailAddress;
		output += "\nPhysical Address: " +personPhysicalAddress;
		
		return output;
		
	}

}
