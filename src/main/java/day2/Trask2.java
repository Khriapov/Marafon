package day2;

import java.util.Scanner;

public class Trask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            for (int i = a + 1; i < b; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
