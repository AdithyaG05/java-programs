package lab3;

import java.util.Scanner;

public class Q5_RemoveWhitespace {

    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("After Removing Whitespace: " +
                removeWhitespace(s));

        sc.close();
    }
}