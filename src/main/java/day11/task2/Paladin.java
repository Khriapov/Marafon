package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private int healHimself;
    private int healTeammate;

    public Paladin() {
        this.physAtt = 15;
        this.physDef = 0.5;
        this.magicDef = 0.2;
        this.healHimself = 25;
        this.healTeammate = 10;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }

    public void physicalAttack(Hero hero) {
        super.physicalAttack(hero);
    }

    @Override
    public void healHimself() {
        health += this.healHimself;
        if (health > MAX_HEALTH) {
            health = MAX_HEALTH;
        }
        System.out.println(this);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += healTeammate;
        if (hero.health > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        }
        System.out.println(hero);
    }
}
