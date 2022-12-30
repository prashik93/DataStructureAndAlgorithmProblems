package main;

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
        System.out.println("]\n");
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
        System.out.print("]\n");
    }
}
