package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File inPutFile = new File("file.txt");
        printResult(inPutFile);
    }

    public static void printResult(File file) {
        int sum = 0;
        int count = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            }
            if (count == 0) {
                System.out.println("Файл пустой");
            }
            double averade = (double) sum / count;
            System.out.printf(averade + "------> %.3f", averade);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}


