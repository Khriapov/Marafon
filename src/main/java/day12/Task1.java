package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Ауди");
        cars.add("БМВ");
        cars.add("Мерседес");
        cars.add("Тайота");
        cars.add("Митсубиси");
        System.out.println(cars);
        cars.add(2, "newCar");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
    }
}