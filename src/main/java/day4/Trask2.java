package day4;
import java.util.Random;


public class Trask2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[10];
        int countMax = 0;
        int countMin = 10000;
        int count0 = 0;
        int summ = 0;
        for (int i = 0; i <array.length; i++) {
            array[i] = rand.nextInt(10000);
            System.out.print(array[i] + ", ");
        }
            for (int a : array) {
                if (a > countMax){
                    countMax = a;
                }
                if (a < countMin){
                    countMin = a;
                }
                if (a%10==0){
                    count0++;
                    summ = summ+a;
                }
            }
        System.out.println();
        System.out.println("наибольший элемент массива " + countMax);
        System.out.println("наименьший элемент массива " + countMin);
        System.out.println("количество элементов массива, оканчивающихся на 0 = " + count0);
        System.out.println("сумму элементов массива, оканчивающихся на 0 = " +summ);
    }
}
