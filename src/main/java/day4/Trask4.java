package day4;
import java.util.Random;
import java.util.Scanner;

public class Trask4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        int summMax = 0;
        int index = 0;

        int cauntSumm = 3;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50);
            System.out.print(array[i] + ", ");
        }
        for (int i = 0; i < array.length - cauntSumm - 1; i++) {
            int summ = 0;
            for (int j = 0; j < cauntSumm; j++) {
                summ += array[i + j];
                if (summMax <= summ) {
                    summMax = summ;
                    index = i;
                }
            }
        }
            System.out.println();
            System.out.println("сумма элементов тройки: " + summMax);
            System.out.println("индекс первого элемента тройки: " + index);
    }
}
