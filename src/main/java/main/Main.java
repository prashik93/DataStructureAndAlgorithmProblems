package main;

import constants.Constants;
import java.util.Scanner;

public class Main {
    private static final Scanner scnr = new Scanner(System.in);
    private final AlgorithmPrograms algorithmPrograms = new AlgorithmPrograms();
    private final DataStructure dataStructure = new DataStructure();

    public static void main(String[] args) {
        System.out.println("Welcome to Data Structure And Algorithm Problems!");
        Main main = new Main();

        boolean flag = true;
        while (flag) {
            System.out.println("\nEnter Which Programs do you want to Run? ");
            System.out.print("1.AlgorithmPrograms\n2.DataStructurePrograms\n0.Exit");
            System.out.print("\nEnter Your Choice : ");
            int usrInput = scnr.nextInt();
            switch (usrInput) {
                case Constants.ALGORITHM_PROGRAMS :
                    main.algorithmsProgramsChoice();
                    break;
                case Constants.DATA_STRUCTURE_PROGRAMS :
                    main.DataStructureProgramsChoice();
                    break;
                case Constants.EXIT :
                    flag = false;
                    break;
                default :
                    System.out.println("\nPlease give valid input ...");
            }
        }
    }

    public void algorithmsProgramsChoice() {
        boolean flag = true;
        while (flag) {
            System.out.println("\nEnter Which Programs do you want to Run? ");
            System.out.print("3.Insertion Sort\n4.Bubble Sort\n6.Anagram Detection\n7.Prime Numbers" +
                    "\n8.Prime Numbers That Are Anagram And Palindrome\n10.Find Your Number\n12.Customizing Message Using Regex" +
                    "\n0.Exit");
            System.out.print("\nEnter Your Choice : ");
            int userChoice = scnr.nextInt();

            switch (userChoice) {
                case Constants.INSERTION_SORT:
                    String[] wordList = {"Apple", "Oracle", "Microsoft", "Google", "HCL"};
                    algorithmPrograms.insertionSort(wordList);
                    break;
                case Constants.BUBBLE_SORT:
                    int[] numbers = {64, 4, 128, 32, 16, 2, 8};
                    algorithmPrograms.bubbleSort(numbers);
                    break;
                case Constants.ANAGRAM_DETECTION:
                    String str1 = "abcd";
                    String str2 = "dcba";
                    algorithmPrograms.anagramDetection(str1, str2);
                    break;
                case Constants.PRIME_NUMBERS:
                    int from = 0;
                    int to = 1000;
                    algorithmPrograms.printAllPrimeNumbers(from, to);
                    break;
                case Constants.PRIME_NUMBERS_THAT_ARE_ANAGRAM_AND_PALINDROME:
                    int num1 = 0;
                    int num2 = 1000;
                    algorithmPrograms.findPrimeNumbersThatAreAnagramAndPalindrome(num1, num2);
                    break;
                case Constants.FIND_YOUR_NUMBER:
                    System.out.print("Guess The Number Of Your Choice : ");
                    int number = scnr.nextInt();
                    int high = (int) Math.pow(2, number);
                    int yourNumber = algorithmPrograms.findYourNumber(0, high);
                    System.out.printf("\nYour Guessed Number Is %d\n", yourNumber);
                    break;
                case Constants.CUSTOMIZING_MESSAGE_USING_REGEX:
                    algorithmPrograms.customizingMessageUsingRegex();
                    break;
                case Constants.EXIT :
                    flag = false;
                    break;
                default:
                    System.out.println("\nPlease Give Valid Input...");
            }
        }
    }

    public void DataStructureProgramsChoice() {
        boolean flag = true;
        while (flag) {
            System.out.println("\nEnter Which Programs do you want to Run? ");
            System.out.print("1.Unordered List\n5.Palindrome Checker\n0.Exit");
            System.out.print("\nEnter Your Choice : ");
            int userChoice = scnr.nextInt();

            switch (userChoice) {
                case Constants.UNORDERED_LIST:
                    dataStructure.readWriteDataInMyLinkedList();
                    break;
                case Constants.PALINDROME_CHECKER:
                    dataStructure.palindromeChecker();
                    break;
                case Constants.EXIT :
                    flag = false;
                    break;
                default:
                    System.out.println("\nPlease Give Valid Input...");
            }
        }
    }
}