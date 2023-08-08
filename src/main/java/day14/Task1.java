package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    private static final int NUMBERS_COUNT = 10;

    public static void main(String[] args) {
        File file = new File("file.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try (Scanner scanner = new Scanner(file)) {
            ;
            String line = scanner.nextLine();
            String[] stringNumbers = line.split(" ");
            if (stringNumbers.length != NUMBERS_COUNT) {
                throw new IllegalArgumentException();
            }
            int[] arrayNumbers = new int[stringNumbers.length];
            int sum = 0;
            int caunt = 0;
            for (String number : stringNumbers) {
                arrayNumbers[caunt++] = Integer.parseInt(number);
                sum += Integer.parseInt(number);
            }
            System.out.println(Arrays.toString(arrayNumbers));
            System.out.println("Сумма чисел массива: " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
