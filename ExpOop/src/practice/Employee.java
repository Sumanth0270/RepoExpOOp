package practice;

public class Employee extends Person 
{
String eid;
String designation;
double salary;
public Employee(String name, long contact, String eid, String designation,double salary) 
{
	super(name, contact);
	this.eid = eid;
	this.designation = designation;
	this.salary=salary;
}
public void profile()
{
	System.out.println("Employee id:"+eid);
	System.out.println("Designation:"+designation);
	System.out.println("Salary:"+salary);
}
}
