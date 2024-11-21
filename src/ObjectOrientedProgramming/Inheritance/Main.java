package ObjectOrientedProgramming.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.9, 6.9, 2.9);
//        Box box2 = new Box(4);
//        Box box3 = new Box(box2);
//        Box box4 = new Box(box1);
//        System.out.println(box1.length + " " + box1.height + " " + box1.width);
//        System.out.println(box2.length + " " + box2.height + " " + box2.width);
//        System.out.println(box3.length + " " + box3.height + " " + box3.width);
//        System.out.println(box4.length + " " + box4.height + " " + box4.width);
//            BoxWeight boxWeight = new BoxWeight();
//            BoxWeight boxWeight2 = new BoxWeight(2.5,3.9,4.9,5.9);
//            System.out.println(boxWeight.height + " " + boxWeight.weight);
//            System.out.println(boxWeight2.height + " " + boxWeight2.weight);

  //      BoxPrice boxPrice = new BoxPrice();
        box1.greeting();
        Box box2 = new BoxWeight();
        box2.greeting();
    }
}
