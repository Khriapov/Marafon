package day7;

class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.println("Изготовитель: "+manufacturer +", год выпуска: "+year+", длинна: "+length+", вес: "+ weight+", количество топлива в баке: "+getFuel());
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public int getFuel() {
        return fuel;
    }

    public void fillUp(int n){
        fuel += n;
    }

    public void compareAirplanes(Airplane airplane1, Airplane airplane2){ if (airplane1.length>airplane2.length){
        System.out.println("Первый самолет длиннее второго");
    } else if (airplane1.length < airplane2.length) {
        System.out.println("Второй самолет длиннее первого");
    }else{
        System.out.println("Самолеты равны");
    }
    }
}
