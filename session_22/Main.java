package OPPS.session_22;

class Car{
    String brand;
    String model;
    double price;
    int yom;
}



public class Main {

    public static void main(String[] args) {
        Car car = new Car();

        // System.out.println(car.brand);
        // System.out.println(car.price);
        // this cmds will give 0 & null as vaule 

        car.brand = "Mahindra";
        car.model = "XUV 700 ";
        car.price = 700000;
        car.yom = 2025;

        
    }
}
