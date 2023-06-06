package day11.task1;

/**
 * “Сборщик” (англ. Picker) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет),
 * get методами для обоих полей, методом toString() и конструктором.
 */
public class Picker implements Worker {
    private int salary;
    private final int UNIT_SALARY = 80;
    private boolean isPayed;
    private Warehouse warehouse;


    public Picker(Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return ("Заработная плата сборщика: " + getSalary() + ", выплачен бонус: " + isPayed);
    }

    public void doWork() {
        warehouse.incrementCountPickedOrders();
        salary += UNIT_SALARY;

    }

    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус сборщику не выплачен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус сборщику уже выплачен");
        } else {
            salary += 70000;
            isPayed = true;
        }
    }
}


