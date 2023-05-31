package day5;

import java.sql.SQLOutput;

public class Trask2 {
    public static void main(String[] args) {
        Motorbike motorbikeOne = new Motorbike("Yamaha", "Синий", 2020 );
        motorbikeOne.getInfo();
    }
}
class Motorbike {
    private String model;
    private String color;
    private int year;
    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }
    public void getInfo(){
        System.out.println("Модель мотобайка: " + getModel());
        System.out.println("Цвет мотобайка: " + getColor());
        System.out.println("Год выпуска мотобайка: " + getYear());
    }
}
