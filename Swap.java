//1. Swap two numbers
import java.util.*;
class Swap{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		System.out.println("Enter other number:");
		int b = sc.nextInt();
		System.out.println("Before swap:"+a+" "+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("After swap:"+a+" "+b);
	}


}