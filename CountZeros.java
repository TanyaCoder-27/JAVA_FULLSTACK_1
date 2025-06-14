import java.util.*;

class CountZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the array elements (0/1)");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are:");
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        int count = 0;
        int zeroCount = 0;

        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] == 0) {
                zeroCount++;
            } else {
                count += zeroCount;
            }
        }

        System.out.println("Zeros count is: " + count);
    }
}
