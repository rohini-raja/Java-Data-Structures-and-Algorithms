package ObjectOrientedProgramming.Inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

   // @Override
    static void greeting() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}
