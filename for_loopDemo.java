public class for_loopDemo {
    public static void main(String args[]) {
        /*
         * for (int i = 1; i <= 10; i++) {
         * System.out.println(i);
         * }
         */

        int number = 10;

        System.out.println("Multiplication Table of 10:");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

    }
}
