package ObjectOrientedProgramming;

public class Wrapperclass {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b= 20;
        Integer n = 45;
        swap(a,b);
        System.out.println(a + " " + b);

        final int Rohini = 234;
        // Rohini =  56;
        final A ro = new A("Rohini Rajasimman");
        ro.name = "other name";
      //  ro = new A("new obj"); - when non primitive is final, we cant reassign it

        A obj;

        for(int i=0;i<2000000000;i++){
            obj = new A("Randommm");
        }
    }

    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }

}

class A {
    final int number = 60;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obj is destroyed");
    }
}