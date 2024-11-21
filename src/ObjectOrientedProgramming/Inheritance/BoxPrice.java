package ObjectOrientedProgramming.Inheritance;

public class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(){
        super();
        this.price = -1;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }

    public BoxPrice(double length, double width, double height, double weight, double price) {
        super(length, width, height, weight);
        this.price = price;
    }

    public BoxPrice(double side, double weight, double price) {
        super(side,weight);
        this.price = price;
    }
}
