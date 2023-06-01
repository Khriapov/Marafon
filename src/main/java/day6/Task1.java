package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike motorbikeOne = new Motorbike("Suzuki","Blue", 2010);
        motorbikeOne.info();
        System.out.println(motorbikeOne.yearDifference(2020));

        System.out.println();

        Car carOne = new Car();
        carOne.setModel("Mazda");
        carOne.setColor("Green");
        carOne.setYear(2023);
        carOne.info();
        System.out.println(carOne.yearDifference(2021));

    }
}

