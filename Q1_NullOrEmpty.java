package lab3;

import java.util.Scanner;

public class Q1_NullOrEmpty {

    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Is Null or Empty? " + isNullOrEmpty(s));

        sc.close();
    }
}