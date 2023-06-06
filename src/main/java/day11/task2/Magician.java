package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {
    private int magicAtt;

    public Magician() {
        this.physAtt = 5;
        this.magicAtt = 20;
        this.physDef = 0;
        this.magicDef = 0.8;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    public void physicalAttack(Hero hero) {
        super.physicalAttack(hero);
    }

    @Override
    public void magicAttack(Hero hero) {
        int damage = (int) (magicAtt - magicAtt * hero.magicDef);
        hero.health -= damage;
        if (hero.health < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
        System.out.println(hero);
    }
}
