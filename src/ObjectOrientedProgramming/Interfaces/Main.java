package ObjectOrientedProgramming.Interfaces;
// which particular method to run is actually determined at run time - Dynamic method dispatch
public class Main {
    public static void main(String[] args) {
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.UpgradeEngine();
        car.start();
    }
}
