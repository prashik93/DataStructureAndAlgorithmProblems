package main;

public class AlgorithmPrograms {
    // 3.Insertion Sort
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
        System.out.print("Sorted Array : [");
        for(int i = 0; i < args.length; i++) {
            System.out.print(args[i] + ", ");
        }
        System.out.println("]\n");
    }
}
