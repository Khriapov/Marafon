package day3;

import java.util.Scanner;

public class Trask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите город:");


        while (true) {
            String city = scanner.nextLine();
            if (city.equals("stop")) {
                break;
            }
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Этот город находится в России");
                    break;
                //Берлин, Мюнхен, Кёльн - Германия
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Этот город находится в Италии");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Этот город находится в Англии");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Этот город находится в Германии");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}

