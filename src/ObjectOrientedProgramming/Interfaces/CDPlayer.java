package ObjectOrientedProgramming.Interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("CD player started");
    }

    @Override
    public void stop() {
        System.out.println("CD player stopped");
    }
}
