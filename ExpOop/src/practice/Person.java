package practice;

public class Person 
{
String name;
long contact;
public Person(String name, long contact) 
{
	this.name = name;
	this.contact = contact;
}
public void display()
{
	System.out.println("Name:"+name);
	System.out.println("Contact:"+contact);
	System.out.println("...............................");
}
}
