package day7;

class Player {
    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers<6){
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers < 6){
            System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers)+" свободных мест");
        }else {
            System.out.println("На поле нет свободных мест");
        }
    }
}