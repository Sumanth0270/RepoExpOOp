package practice;

public class Student extends Person
{
int id;
String course;
public Student(String name, long contact, int id, String course) 
{
	super(name, contact);
	this.id = id;
	this.course = course;
}
public void details()
{
	System.out.println("ID:"+id);
	System.out.println("Course:"+course);
}
}
