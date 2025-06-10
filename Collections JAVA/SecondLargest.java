//Find second largest element in given array


import java.util.*;
class SecondLargest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elememts:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		secondLargest(arr,n);
	}
	public static void secondLargest(int[] arr , int n){
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++){

			if(arr[i] > largest){
				secondLargest = largest;
				largest = arr[i];

			}
			else if(arr[i]<largest && arr[i]>secondLargest){
				secondLargest = arr[i];

			}

		}
		if(secondLargest == Integer.MIN_VALUE)
			System.out.println("The second largest element: -1");

		else
			System.out.println("The second largest element:"+secondLargest);

	}


}

/*

o/p:
Enter no.of elememts:
6
Enter array elements:
77
90
90
77
43
12
The second largest element:77
*/

