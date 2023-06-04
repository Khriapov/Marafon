package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTimeString = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i <= 20000; i++) {
            string += i + " ";
        }
        long stopTimeString = System.currentTimeMillis();
        System.out.println();
        System.out.println("Длительность работы в мс (String): " + (stopTimeString - startTimeString));
        System.out.println();
        long startTimeStringBulder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            stringBuilder.append(i).append(" ");
        }
        long stopTimeStringBulder = System.currentTimeMillis();
        System.out.println("Длительность работы в мс (StringBulder): " + (stopTimeStringBulder - startTimeStringBulder));
    }
}
