package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File inputFile = new File("src/main/resources/shoes.csv");
        File outPut = new File("src/main/resources/missing_shoes.txt");
        try {
            Scanner scanner = new Scanner(inputFile);
            PrintWriter printWriter = new PrintWriter(outPut);
            int positionNumber = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] arrayString = line.split(";");
                if (arrayString.length == 3) {
                    if (Integer.parseInt(arrayString[2]) == 0) {
                        printWriter.println(arrayString[0] + "; " + arrayString[1] + "; " + arrayString[2] + ";");
                    }
                } else {
                    System.out.println("В строке " + positionNumber + ", больше или меньше 3-х характеристик");
                }
                positionNumber++;
            }
            printWriter.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
