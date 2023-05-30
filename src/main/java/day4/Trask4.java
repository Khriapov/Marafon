package day4;
import java.util.Random;

public class Trask4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        int summMax = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50);
            System.out.print(array[i] + ", ");
        }
        for (int i = 0; i < array.length-2; i++) {
            int summ = 0;
            summ = array[i]+array[i+1]+array[i+2];
            if (summMax <= summ){
                summMax = summ;
                index = i;
            }
        }
        System.out.println();
        System.out.println("сумма тройки: " + summMax);
        System.out.println("индекс первого элемента тройки: " + index);
    }
}
