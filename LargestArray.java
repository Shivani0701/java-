import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int largestElement = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > largestElement) {
                largestElement = array[i];
            }
        }

        System.out.println("The largest element in the array is: " + largestElement);

        scanner.close();
    }
}
