package ObjectOrientedProgramming.Interfaces;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("PowerEngine Started");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("PowerEngine Accelerate");
    }
}
