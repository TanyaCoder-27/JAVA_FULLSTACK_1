import java.util.*;
class Prime{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();


		int cnt =2;
		for(int i=2;i*i<=n;i++){
			
			if(n%i==0){
				cnt++;
				break;
			}
				
		}

		if(cnt==2){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
	}
}