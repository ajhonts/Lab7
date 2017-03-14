
public class Employee {
	private String lastName, firstName, department, number;
	public Employee(String lastName, String firstName, String department, String number){
		this.lastName = lastName;
		this.firstName = firstName;
		this.department = department;
		this.number = number;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getDepartment(){
		return this.department;
	}
	
	public String getNumber(){
		return this.number;
	}
	
	public String toString(){
		return (this.lastName+", "+this.firstName+" "+"Dept: "+this.department+" Phone: "+this.number);
	}
	
	
}
