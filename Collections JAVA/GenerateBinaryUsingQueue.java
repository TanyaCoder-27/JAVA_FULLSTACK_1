import java.util.*;

class GenerateBinaryUsingQueue{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N:");
		int n = sc.nextInt();
		generateBinaryNumbers(n);
		

	}

	private static void generateBinaryNumbers(int n){

		Queue <String> queue = new LinkedList<>();
		queue.offer("1");
		System.out.println("Binary Numbers from 1 to " + n + ": ");
		for(int i=1;i<=n;i++){
			String binaryNum = queue.poll();
			System.out.println(binaryNum);
			
			queue.offer(binaryNum + "0");
			queue.offer(binaryNum + "1");

		}


	}



}

/*
Enter N:
5
Binary Numbers from 1 to5:
1
10
11
100
101
*/