package lab3;

import java.util.Scanner;

public class Q3_ReverseString {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string to reverse: ");
        String s = sc.nextLine();

        System.out.println("Reversed String: " + reverseString(s));

        sc.close();
    }
}