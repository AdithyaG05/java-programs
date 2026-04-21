//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
// capitalizeWords()
package lab3;

import java.util.Scanner;

public class Q6_CapitalizeWords {

    public static String capitalizeWords(String str) {
        String[] words = str.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();

        for (String w : words) {
            if (w.length() > 0) {
                result.append(Character.toUpperCase(w.charAt(0)))
                      .append(w.substring(1))
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Capitalized: " + capitalizeWords(s));

        sc.close();
    }
}
