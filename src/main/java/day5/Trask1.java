package day5;

import org.w3c.dom.ls.LSOutput;

public class Trask1 {
    public static void main(String[] args) {
        Car carOne = new Car();
        carOne.setModel("Nissan Almera");
        carOne.setColor("Белый");
        carOne.setYear(2011);
        carOne.getCarInfo();
    }
}

class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void getCarInfo(){
        System.out.println("Модель автомобиля: " + getModel());
        System.out.println("Цвет автомобиля: " + getColor());
        System.out.println("Год выпуска автомобиля: " + getYear());
    }
}


