import java.util.*;
class Triangle{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		double a = sc.nextInt();
		System.out.println("Enter second number:");
		double b = sc.nextInt();
		System.out.println("Enter third number:");
		double c = sc.nextInt();
		System.out.println("Perimeter:"+(a+b+c));
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area:"+ area);
	}


}