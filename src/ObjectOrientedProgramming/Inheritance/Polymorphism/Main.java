package ObjectOrientedProgramming.Inheritance.Polymorphism;
//Polymorphism - many ways to represent a single entity/item\
//act of representing the same thing in multiple ways
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
