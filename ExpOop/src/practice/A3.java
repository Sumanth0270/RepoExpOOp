package practice;

public class A3 
{
public static void main(String[] args) 
{
A1 ob=new A1();
System.out.println(ob.sum);	
//System.out.println(ob.c);//Error because c is private variable for class A1
ob.display();//By using public method(display) in class A we can access private variable
}
}
 