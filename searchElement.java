
import java.util.Scanner;

public class searchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == searchElement) {
                found = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array");
        }

        scanner.close();
    }
}
