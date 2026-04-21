//Q9. Write a Java Program for Creating a random string of a specified length using user defined
// function generateRandomString()
package lab3;

import java.util.Scanner;
import java.util.Random;

public class Q9_RandomString {

    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of random string: ");
        int len = sc.nextInt();

        System.out.println("Random String: " + generateRandomString(len));

        sc.close();
    }
}
