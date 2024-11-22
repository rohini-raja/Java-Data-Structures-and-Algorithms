package ObjectOrientedProgramming.Access;

public class A {
    int num;
    String name;
    int[] arr;

    public A(String name, int num) {
        this.name = name;
        this.num = num;
        this.arr = new int[num]; //creating the array here
    }
}
