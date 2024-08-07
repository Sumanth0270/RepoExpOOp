package practice;

public class DriverPersonStudent 
{
public static void main(String[] args) 
{
	Student s=new Student("Sam",9008007001l,101,"BSc");
	s.display();
	s.details();
	System.out.println("_______________________________________________");
	Person p=new Person("Tina",9008007002l);
	p.display();
	System.out.println("_______________________________________________");
	Employee e=new Employee("Jack",9008007004l,"E001","Trainee",35000);
	e.display();
	e.profile();
}
}
