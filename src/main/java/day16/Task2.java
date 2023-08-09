package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter1 = new PrintWriter("file1.txt");
        File file1 = new File("file1.txt");
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            printWriter1.println(random.nextInt(101));
        }
        printWriter1.close();
        PrintWriter printWriter2 = new PrintWriter("file2.txt");
        File file2 = new File("file2.txt");
        Scanner scanner1 = new Scanner(file1);
        int sum = 0;
        int count = 0;
        while (scanner1.hasNextInt()) {
            sum += scanner1.nextInt();
            count++;
            if (count == 20) {
                printWriter2.println(sum / 20.0);
                sum = 0;
                count = 0;
            }
        }
        printWriter2.close();
        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner2 = new Scanner(file);
        double sum = 0;
        int res = 0;
        while (scanner2.hasNextLine()) {
            sum += Double.parseDouble(scanner2.nextLine());
        }
        System.out.println("сумма с вещественной частью: " + sum);
        System.out.println("Сумма без вещественной части: " + (int) sum);
    }
}
