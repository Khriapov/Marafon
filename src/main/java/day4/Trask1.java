package day4;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Trask1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int n = scanner.nextInt();
        int [] array = new int[n];
        int count8 = 0;
        int count1 = 0;
        int count0 = 0;
        int countNot0 = 0;
        int summa = 0;

        for (int i = 0; i <array.length; i++) {
            array[i]=rand.nextInt(11);
        }
        for (int a:array){
            System.out.print(a + ", ");
        }
        System.out.println();
        System.out.println("Длинна массива: " + array.length);
        for (int i = 0; i <array.length; i++) {
            if(array[i]>8){
                count8++;
            }
        }
        System.out.println("Количестве чисел больше 8 = " + count8);

        for (int i = 0; i <array.length; i++) {
            if(array[i]==1){
                count1++;
            }
        }
        System.out.println("Количестве чисел равных 1 = "+count1);


        for (int i = 0; i <array.length; i++) {
            if(array[i]%2==0){
                count0++;
            }else{
                countNot0++;
            }
        }
        System.out.println("Количестве четных чисел = "+count0);
        System.out.println("Количестве нечетных чисел = " + countNot0);

        for (int i = 0; i <array.length; i++) {
            summa = summa + array[i];
        }
        System.out.println("Сумма всех элементов массива = " + summa);
    }
}
