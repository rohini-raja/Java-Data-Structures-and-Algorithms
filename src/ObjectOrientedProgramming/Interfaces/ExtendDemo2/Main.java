package ObjectOrientedProgramming.Interfaces.ExtendDemo2;

public class Main implements A,B{

    @Override
    public void greet() {
        System.out.println("Hello World Greetings");
    }

//    @Override
//    public void fun() {
//        A.super.fun();
//    }

    public static void main(String[] args) {
        Main m = new Main();
        A.greets();
    }
}
