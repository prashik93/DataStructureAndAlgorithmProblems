package main;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class DataStructure {
    private final Scanner scnr = new Scanner(System.in);
    private final Queue<Character> queue = new LinkedList<>();
    private final MyLinkedList<String> myLinkedList = new MyLinkedList<>();

    public List<String> readDataFromTextFile(){
        BufferedReader br = null;
        List<String> collect = null;
        try {
            File file = new File("E:\\Projects\\intellijProjects\\DataStructureAndAlgorithm\\src\\main\\java\\resources\\wordsList.txt");
            br = new BufferedReader(new FileReader(file));

            String line = null;
            while((line = br.readLine()) != null) {
                collect = Arrays.stream(line.split(", ")).collect(Collectors.toList());
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(br != null) {
                try{
                    br.close();
                } catch (Exception ignored) {};
            }
        }
        return collect;
    }

    public void writeDataIntoTheTextFile() {
        final String outputFilePath = "E:\\Projects\\intellijProjects\\DataStructureAndAlgorithm\\src\\main\\java\\resources\\wordsList.txt";
        File file = new File(outputFilePath);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(myLinkedList.toString());
            bw.newLine();
            System.out.println("Data Write Successfully...");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found. Please re-enter the file name.");
        }
    }

    public void readWriteDataInMyLinkedList() {
        List<String> readDataList = readDataFromTextFile();
        if(readDataList == null){
            System.out.println("\nNo Data Found In File");
            return;
        }
        System.out.print("Enter The Word : ");
        String key = scnr.next();
        for(int i = 0; i < readDataList.size(); i++) {
            if(myLinkedList.search(key) != null) {
                INode<String> searchResult = myLinkedList.search(key);
                myLinkedList.remove(searchResult);
            } else {
                MyNode<String> myNode = new MyNode<>();
                myNode.setKey(key);
                myLinkedList.add(myNode);
            }
        }
        myLinkedList.printMyNodes();
        writeDataIntoTheTextFile();
    }

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
