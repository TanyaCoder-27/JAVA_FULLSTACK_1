import java.util.*;
class StrRev{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		
		System.out.println("Before reverse:"+str);
		
		char[] res = str.toCharArray();

		for(int i= res.length-1;i>=0;i--){

			System.out.print(res[i]);
		}
		
	}



	


}