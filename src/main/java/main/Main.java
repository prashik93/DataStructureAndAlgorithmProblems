package main;

import constants.Constants;

import java.util.Scanner;

public class Main {
    private final Scanner scnr = new Scanner(System.in);
    private final AlgorithmPrograms algorithmPrograms = new AlgorithmPrograms();
    public static void main(String[] args) {
        System.out.println("Welcome to Data Structure And Algorithm Problems!");
        Main main = new Main();
        main.algorithmsProgramsChoice();
    }

    public void algorithmsProgramsChoice() {
        while (true) {
            System.out.println("\nEnter Which Programs do you want to Run? ");
            System.out.print("3.Insertion Sort\n4.Bubble Sort");
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
                default:
                    System.out.println("\nPlease Give Valid Input...");
            }
        }
    }
}