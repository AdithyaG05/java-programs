package lab3;

import java.util.Scanner;

public class Q10_CountWords {

    public static int countWords(String str) {
        if (str.trim().isEmpty()) return 0;

        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Word Count: " + countWords(s));

        sc.close();
    }
}