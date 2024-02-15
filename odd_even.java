import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        /*
         * int num = 10;
         * 
         * if (num % 2 == 0) {
         * 
         * System.out.println("Entered Number is Even");
         * }
         * 
         * else {
         * 
         * System.out.println("Entered Number is Odd");
         * }
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");

        }
    }
}
