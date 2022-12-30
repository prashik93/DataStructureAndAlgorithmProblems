package main;

import java.util.Arrays;

public class AlgorithmPrograms {
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

    public void anagramDetection(String str1, String str2) {
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
            if (equals) {
                System.out.println("\nStrings are Anagram");
                return;
            }
            System.out.println("\nStrings are Not Anagram");
            return;
        }
        System.out.println("\nStrings are Not Anagram");
    }

    public void findPrimeNumbers(int num1, int num2) {
        System.out.print("\nPrime numbers between 0 - 1000 are : ");
        for(int i = num1; i <= num2; i++) {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
