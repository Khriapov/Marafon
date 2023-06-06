package day11.task1;

public class Warehouse {
    private int countPickedOrders;                    // количество собранных заказов
    private int countDeliveredOrders;                 // количество доставленных заказов


    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int incrementCountPickedOrders() {
        return countPickedOrders++;
    }

    public int incrementCountDeliveredOrders() {
        return countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return ("количество собранных заказов: " + countPickedOrders + ", количество доставленных заказаов: " + countDeliveredOrders);
    }
}
