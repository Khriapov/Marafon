package day7;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player.info();
        Player player1 = new Player(random.nextInt(11)+90);
        Player player2 = new Player(random.nextInt(11)+90);
        Player player3 = new Player(random.nextInt(11)+90);
        Player player4 = new Player(random.nextInt(11)+90);
        Player.info();
        Player player5 = new Player(random.nextInt(11)+90);
        Player player6 = new Player(random.nextInt(11)+90);
        Player player7 = new Player(random.nextInt(11)+90);
        Player.info();
        System.out.println("выносливость первого игрока "+player1.getStamina());
        for (int i = 0; i <95; i++) {
            player1.run();
        }
        Player.info();
    }
}
