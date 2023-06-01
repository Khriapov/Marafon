package day6;

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

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {

        return Math.abs(inputYear - year);
    }

    public void getCarInfo(){
        System.out.println("Модель автомобиля: " + getModel());
        System.out.println("Цвет автомобиля: " + getColor());
        System.out.println("Год выпуска автомобиля: " + getYear());
    }
}


