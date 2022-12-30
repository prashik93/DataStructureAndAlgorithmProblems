package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Data Structure And Algorithm Problems!");
        AlgorithmPrograms algorithmPrograms = new AlgorithmPrograms();

        String[] wordList = {"Apple", "Oracle", "Microsoft", "Google", "HCL"};
        algorithmPrograms.insertionSort(wordList);
    }
}