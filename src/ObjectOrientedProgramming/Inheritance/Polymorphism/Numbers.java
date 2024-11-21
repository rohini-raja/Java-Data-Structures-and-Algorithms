package ObjectOrientedProgramming.Inheritance.Polymorphism;

public class Numbers {

    double sum(double a,int b){
        return a+b;
    }

    int sum(int a, int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(3,4);
        obj.sum(3,4,5);
        System.out.println(obj.sum(3,4));
        System.out.println(obj.sum(3,4,5));
       // obj.sum(5,6,8,9);
    }
}
