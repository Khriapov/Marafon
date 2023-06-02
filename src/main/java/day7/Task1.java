package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplaneOne = new Airplane("Boing",2020,191,5000);
        Airplane airplaneTwo = new Airplane("Airbus",2021,190,5500);
        airplaneOne.compareAirplanes(airplaneOne,airplaneTwo);
    }
}