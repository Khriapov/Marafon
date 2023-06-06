package day11.task2;

public abstract class Hero implements PhysAttack {
    protected int health;   // здоровье
    protected double physDef;  // процент поглощения физического урона
    protected double magicDef; // процент поглощения магического урона
    protected int physAtt;
    protected final int MIN_HEALTH = 0;
    protected final int MAX_HEALTH = 100;

    public Hero() {
        this.health = 100;
    }

    public void physicalAttack(Hero hero) {
        int damage = (int) (physAtt - physAtt * hero.physDef);
        hero.health -= damage;
        if (hero.health < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
        System.out.println(hero);
    }
}
