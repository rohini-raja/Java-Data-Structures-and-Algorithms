package ObjectOrientedProgramming.Interfaces.Nested;

public class A {
    //Nested Interfaces
    public interface nestedInterface {
        boolean isOddorEven(int num);
    }
}

class B implements A.nestedInterface {

    @Override
    public boolean isOddorEven(int num) {
        return (num & 1) == 1;
    }
}

