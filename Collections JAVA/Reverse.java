import java.util.*;
class Reverse{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elememts:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		rev(arr,n);
	}
	public static void rev(int[] arr, int n){
		int l= 0;
		int r = n-1;
		
		while(l<r){
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;

			l++;
			r--;
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		

	}
}