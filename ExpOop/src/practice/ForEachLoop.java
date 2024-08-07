package practice;

public class ForEachLoop 
{
     public static void main(String[] args) 
	{
    		int a[]=new int[5];
            a[0]=10;
    	    a[1]=20;
    	    a[2]=30;
    	    char b[]=new char[5];
    	    b[2]='o';
    	    b[3]='n';
    	    b[4]='e';
    	    for(int i=0;i<=a.length-1;i++)
    	    {
    	    	System.out.print(a[i]+" ");
    	    }
    	    System.out.println();
    	    for(int i:a)
    	    {
    	    	System.out.print(i+" ");
    	    }
    	    System.out.println();
    	    for(char c:b)
    	    {
    	    	System.out.print(c+" ");
    	    }
	}
}
