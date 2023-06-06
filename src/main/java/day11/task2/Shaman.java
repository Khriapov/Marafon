package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {
    private int healHimself;
    private int healTeammate;
    private int magicAtt;


    public Shaman() {
        this.physAtt = 10;
        this.magicAtt = 15;
        this.physDef = 0.2;
        this.magicDef = 0.2;
        this.healHimself = 50;
        this.healTeammate = 30;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }

    @Override
    public void physicalAttack(Hero hero) {
        super.physicalAttack(hero);
    }

    @Override
    public void magicAttack(Hero hero) {
        int damage = (int) (magicAtt - magicAtt * hero.magicDef);
        hero.health -= damage;
        if (hero.health < 0) {
            hero.health = 0;
        }
        System.out.println(hero);
    }

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