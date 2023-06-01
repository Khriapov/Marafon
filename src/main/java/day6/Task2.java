package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplaneOne = new Airplane("Boing",1999,180,5000);
        airplaneOne.info();
        airplaneOne.setYear(2022);
        airplaneOne.setLength(200);
        airplaneOne.fillUp(750);
        airplaneOne.fillUp(100);
        airplaneOne.info();
    }
}
