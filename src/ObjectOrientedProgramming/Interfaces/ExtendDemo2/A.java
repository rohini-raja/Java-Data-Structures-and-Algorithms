package ObjectOrientedProgramming.Interfaces.ExtendDemo2;

public interface A {
    //Static interface methods should always have a body
    //Call via the interface name
    static void greets(){
        System.out.println("Hey im static");
    }
    default void fun(){
        System.out.println("I'm in A interface - called by fun()");
    }
}
