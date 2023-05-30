package day4;
import java.util.Random;

public class Trask3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int[12][8];
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                array[i][j] = rand.nextInt(50);
            }
        }
        int maxSumm = 0;
        int index =0;
        for (int i = 0; i <array.length; i++) {
            int summ = 0;
            for (int j = 0; j <array[i].length; j++) {
                summ = summ + array[i][j];
            }
            if (maxSumm<=summ){
                maxSumm=summ;
                index=i;
            }
        }
        System.out.println("Индекс строки, сумма чисел в которой максимальна = "+index);

    }
}
