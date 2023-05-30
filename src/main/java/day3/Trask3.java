package day3;

import java.util.Scanner;

public class Trask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Введите делимое: ");
            double delimoe = scanner.nextDouble();
            System.out.println("Введите делитель: ");
            double delitel = scanner.nextDouble();
            double resultat = 0;
            if (delitel==0){
                System.out.println("деление №"+(i+1)+" не выполнено, деление на 0 невозможно");
                continue;
            }
            resultat = delimoe/delitel;
            System.out.println("Результат деления №"+(i+1)+" = " + resultat);
        }
    }
}
