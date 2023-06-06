package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouseOne = new Warehouse();
        Courier courierOne = new Courier(warehouseOne);
        Picker pickerOne = new Picker(warehouseOne);
        businessProcess(pickerOne);
        businessProcess(courierOne);
        System.out.println();
        System.out.println(warehouseOne);
        System.out.println(pickerOne);
        System.out.println(courierOne);
        System.out.println();
        Warehouse warehouseTwo = new Warehouse();
        Courier courierTwo = new Courier(warehouseTwo);
        Picker pickerTwo = new Picker(warehouseTwo);
        businessProcess(pickerTwo);
        businessProcess(courierTwo);
        System.out.println(warehouseTwo);
        System.out.println(pickerTwo);
        System.out.println(courierTwo);
    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
