package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlgorithmPrograms {
    private Scanner scnr = new Scanner(System.in);

    public void insertionSort(String[] args) {
        String temp = "";
        for(int i = 0; i < args.length; i++) {
            for(int j = i + 1; j < args.length; j++) {
                if(args[i].compareTo(args[j]) > 0) {
                    temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        System.out.print("\nSorted Array : [");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if(i < args.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void bubbleSort(int[] num) {
        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < num.length -1; j++) {
                if(num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.print("\nSorted Array : [");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if(i < num.length-1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public boolean anagramDetection(String str1, String str2) {
        if(str1.length() == str2.length()) {
            char[] arr1 = str1.toLowerCase().toCharArray();
            char[] arr2 = str2.toLowerCase().toCharArray();

            for(int i = 0; i < arr1.length; i++) {
                for(int j = i+1; j < arr1.length; j++) {
                    char temp = ' ';
                    if(arr1[i] > arr1[j]) {
                        temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }

            for(int i = 0; i < arr2.length; i++) {
                for(int j = i+1; j < arr2.length; j++) {
                    char temp = ' ';
                    if(arr2[i] > arr2[j]) {
                        temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }

            boolean equals = Arrays.equals(arr1, arr2);
            return equals;
        }
        return false;
    }

    public List<Integer> findPrimeNumbers(int num1, int num2) {
        System.out.print("\nPrime numbers between 0 - 1000 are : ");
        ArrayList<Integer> primeNumberList = new ArrayList<>();
        for(int i = num1; i <= num2; i++) {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeNumberList.add(i);
            }
        }
        return primeNumberList;
    }

    public void printAllPrimeNumbers(int num1, int num2) {
        List<Integer> primeNumbers = findPrimeNumbers(num1, num2);
        for (Integer integer : primeNumbers) {
            System.out.print(integer + " ");
        }
    }

    public void findPrimeNumbersThatAreAnagramAndPalindrome(int num1, int num2) {
        ArrayList<Integer> primeAnagramList = new ArrayList<>();
        ArrayList<Integer> primePalindromeList = new ArrayList<>();
        List<Integer> primeNumbers = findPrimeNumbers(num1, num2);
        for (Integer number : primeNumbers) {
            int rev = 0;
            int primeNumber = number;
            int temp = primeNumber;
            while (temp > 0) {
                int rem = temp % 10;
                rev = (rev * 10) + rem;
                temp = temp / 10;
            }
            // To check Prime Palindrome Numbers
            if (rev == primeNumber) {
                primePalindromeList.add(rev);
            }
        }

        for (int i = 0; i < primeNumbers.size(); i++) {
            for (int j = i + 1; j < primeNumbers.size(); j++) {
                String str1 = Integer.toString(primeNumbers.get(i));
                String str2 = Integer.toString(primeNumbers.get(j));
                boolean result = anagramDetection(str1, str2);
                if (result) {
                    primeAnagramList.add(Integer.valueOf(str1));
                    primeAnagramList.add(Integer.valueOf(str2));
                }
            }
        }

        printAllPrimeNumbers(num1, num2);

        System.out.print("\nPrime Palindrome : " );
        for (Integer integer : primePalindromeList) {
            System.out.print(integer + " ");
        }

        System.out.print("\nPrime Anagram : " );
        for (Integer integer : primeAnagramList) {
            System.out.print(integer + " ");
        }

    }

    public int findYourNumber(int low,int high){
        int mid = low + ((high - low) / 2);
        System.out.printf("\nIs Number Is Less Than %d? : ", mid);
        System.out.print("\nType 1 for True\nType 2 for False\nType 3 If The Number Is Your Guessed Number");
        System.out.print("Enter Your Choice : ");
        int usrInput = scnr.nextInt();
        if(usrInput == 1)
            return findYourNumber(low, mid);
        else if (usrInput == 2) {
            return findYourNumber(mid, high);
        } else {
            return mid;
        }
    }
}
