
import java.util.Arrays;
import java.util.Scanner;

public class remove_dupli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        int length = 1;
        for (int i = 1; i < n; i++) {
            if (array[i] != array[i - 1]) {
                array[length++] = array[i];
            }
        }

        int[] resultArray = Arrays.copyOf(array, length);

        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));

        scanner.close();
    }
}
