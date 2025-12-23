package session10_Gioi2;

public class Car {
    int currentSpeed = 0;

    public void accelerate(){
        System.out.println("Car accelerates by default: +10 km/h");
        currentSpeed += 10;
    }
    public void accelerate(int speed){
        System.out.println("Car accelerates by \" + speed + \" km/h");
        currentSpeed += speed;

    }
    public void accelerate(int speed, int seconds){
        System.out.println("Car accelerates \" + increase + \" km/h (speed x time)");
        int  increase = speed * seconds;
        currentSpeed += increase;
    }
    public void printStatus(){
        System.out.println("Current speed: " + currentSpeed +" km/h");
    }

    static void main() {
        Car car = new Car();

        car.accelerate();
        car.printStatus();

        car.accelerate(20);
        car.printStatus();

        car.accelerate(10, 2);
        car.printStatus();
    }
}
