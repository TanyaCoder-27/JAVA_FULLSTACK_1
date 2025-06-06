import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter a number");
		n=sc.nextInt();
		int a=0,b=1;
		int c=0;
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			a=b;b=c;
		}
		System.out.println("The fibonnacci number for n is "+c);
		
	}
}