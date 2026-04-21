//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
// and punctuation) using user defined function isPalindrome():
package lab3;

import java.util.Scanner;

public class Q4_Palindrome {

    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Is Palindrome? " + isPalindrome(s));

        sc.close();
    }
}
