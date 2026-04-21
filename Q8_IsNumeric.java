package lab3;

import java.util.Scanner;

public class Q8_IsNumeric {

    public static boolean isNumeric(String str) {
        return str.matches("[0-9]+");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Is Numeric? " + isNumeric(s));

        sc.close();
    }
}