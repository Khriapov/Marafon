package day12;

import java.util.List;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        addEvenNumbers(0, 30, numbers);
        addEvenNumbers(300, 350, numbers);
    }

    public static void addEvenNumbers(int from, int to, List<Integer> list) {
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                list.add(i);
                System.out.println(i);
            }
        }
    }
}

