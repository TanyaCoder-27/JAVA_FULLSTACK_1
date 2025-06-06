import java.util.Scanner;

class Star {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        sc.close();
    }
}