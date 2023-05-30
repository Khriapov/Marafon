package day2;

import java.util.Scanner;

public class Trask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        int c = a + 1;
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            while (c < b) {
                if (c % 5 == 0 && c % 10 != 0) {
                    System.out.print(c + ", ");
                }
                c++;
            }
        }
    }
}
