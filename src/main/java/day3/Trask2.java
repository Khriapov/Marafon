package day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Trask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите делимое: ");
            double delimoe = scanner.nextDouble();
            System.out.println("Введите делитель: ");
            double delitel = scanner.nextDouble();
            double resultat = 0;
            if (delitel==0){
                System.out.println("Вы ввели в качестве делителя 0, программа завершает свою работу");
                break;
            }
            resultat = delimoe/delitel;
            System.out.println("Результат деления: " + resultat);
        }
    }
}

