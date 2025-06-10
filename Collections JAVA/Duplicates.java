 //Remove duplicates from a list while preserving order 

import java.util.*;
class Duplicates{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elememts:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		removeDuplc(arr,n);
	}
	public static void removeDuplc(int arr[],int n){
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		for(int i=0;i<n;i++){
			hs.add(arr[i]);
		}
		System.out.println("After Removing Duplicates: " + hs);
	}
}

/*
o/p:

Enter no.of elememts:
6
Enter array elements:
1
2
5
1
2
7
After Removing Duplicates: [1, 2, 5, 7]

*/

/*
import java.util.LinkedHashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 2, 4, 3, 5};
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));

        System.out.println(set); // Output: [1, 2, 3, 4, 5]
    }
}

*/


/*
import java.util.*;
class Duplicates{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();

		}
		int res[] = removeDuplicates(arr,n);
		
		for(int num : res){

			System.out.println(num);
		}


	}

	public static int[] removeDuplicates(int[] arr, int n){

		LinkedHashSet<Integer> res = new LinkedHashSet<>();
		for(int num : arr){
			res.add(num);

		}
		

		int[] uniq_arr = new int[res.size()];
		int index =0;

		for(int num : res){
			uniq_arr[index++] = num;

		}

		return uniq_arr;

	}



}
*/