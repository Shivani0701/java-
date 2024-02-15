import java.util.LinkedList;
import java.util.Queue;

public class palindrome_queue {
    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            queue.offer(ch);
        }

        StringBuilder reversedStr = new StringBuilder();
        while (!queue.isEmpty()) {
            reversedStr.insert(0, queue.poll());
        }

        return str.equals(reversedStr.toString());
    }

    public static void main(String[] args) {
        String palindromeStr = "radar";
        String nonPalindromeStr = "hello";

        System.out.println(palindromeStr + " is a palindrome: " + isPalindrome(palindromeStr));
        System.out.println(nonPalindromeStr + " is a palindrome: " + isPalindrome(nonPalindromeStr));
    }
}
