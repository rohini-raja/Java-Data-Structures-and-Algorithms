package ObjectOrientedProgramming.Interfaces;
// which particular method to run is actually determined at run time - Dynamic method dispatch
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.stop();
        car.brake();
    }
}
