package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private final int UNIT_SALARY = 100;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.salary = salary;
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public Courier(boolean isPayed) {
        this.isPayed = isPayed;
    }

    public String toString() {
        return ("Заработная плата курьера: " + getSalary() + ", выплачен бонус " + isPayed);
    }

    public void doWork() {
        salary += UNIT_SALARY;
        warehouse.incrementCountDeliveredOrders();
    }

    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус курьеру не выплачен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус курьеру уже выплачен");
        } else {
            salary += 50000;
            isPayed = true;
        }
    }
}
