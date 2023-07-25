package Abstraction;
abstract class Car
{
    String color;
    int price;
    
    public Car(String color,int price)
    {
    this.color=color;
    this.price=price;
    }
    // concrete method c
    // common to all cars no diff in implementation for all cars
    void displayCar()
    {
        System.out.println(color+","+price);
    }
    // abstract method diff for all cars
    public abstract void car_charged();

}

class Tesla extends Car
{

private String charge_type;
public Tesla(String charge_type)
{
super("Black",100000);
this.charge_type=charge_type;
}
@Override
public void car_charged()
{
    System.out.println("Tesla charged with "+charge_type);
}
}

class BMW extends Car
{
    private String charge_type;
    public BMW(String charge_type)
    {
    super("White",200000);// call to car contructor
    this.charge_type = charge_type;
    }
    @Override
    public void car_charged()
    {
    
    System.out.println("BMW charged with "+charge_type);
    }
}

public class CarManufacturing
{
    public static void main(String[] args) {
        Car t=new Tesla("electric power");
        t.displayCar();
        t.car_charged();

        BMW b=new BMW("petrol");
        b.displayCar();
        b.car_charged();
    }
}