package ObjectOrientedProgramming.Inheritance.Polymorphism;
//Polymorphism - many ways to represent a single entity/item\
//act of representing the same thing in multiple ways
// Types of polymorphism
/* 1. Compile Time/Static polymorphism - Achieved via method overloading
Method overloading - same name but type, arguments, return types, ordering
(order of the type, like this is string and the next one is int)
can be different
examples : multiple constructors
A a = new A();
A a =new A(1,4); - it will look in the compile time only
----------------------------------------------------------------------
2. Run time/Dynamic polymorphism - Achieved by method overriding
when child class has the method name same as the super class, using @override

Parent obj  = new Child() -> child will only be called this is called upcasting
This is how overriding works
How java determines this - dynamic method dispatch (runtime only it decides which one to call)

Final method
Early binding
late binding
 */
public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Sqaure sqaure = new Sqaure();
        Triangle triangle = new Triangle();

        circle.area();
        sqaure.area();
        triangle.area();
        shapes.area();

    }
}
