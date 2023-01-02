package main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DataStructure {
    private final Scanner scnr = new Scanner(System.in);
    private final Queue<Character> queue = new LinkedList<>();

    public void palindromeChecker() {
        System.out.print("Enter The String To Check It Is Palindrome Or Not : ");
        String usrInput = scnr.next();

        for (int i = usrInput.length() - 1; i >= 0; i--) {
            queue.add(usrInput.charAt(i));
        }

        String revString = "";
        while (!queue.isEmpty()) {
            revString = revString + queue.remove();
        }
        if (usrInput.equals(revString))
            System.out.println("The input string is palindrome.");
        else
            System.out.println("The input string not palindrome.");
    }
}
