package ObjectOrientedProgramming.Abstraction;

public class Son extends Parent{

    public Son(int age){
           // this.age = age;
            super(age);
    }
    @Override
    void career() {
        System.out.println("I'm going to be a Engineer");
    }

    @Override
    void partner() {
        System.out.println("I love Murugar");
    }
}
