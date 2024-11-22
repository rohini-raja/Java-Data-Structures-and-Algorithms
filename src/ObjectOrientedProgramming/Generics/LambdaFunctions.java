package ObjectOrientedProgramming.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        // int[] arr = {3,4,52,1};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i+1);
        }

        // list.forEach((item)->System.out.println(item*2));

        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        list.forEach(fun);

        Operation sum = (a, b) -> (a+b);
        Operation prod = (a,b) -> a*b;
        Operation diff = (a,b) -> a-b;
        Operation div = (a,b) -> a/b;

        LambdaFunctions myCalculator  = new LambdaFunctions();
        System.out.println(myCalculator.operate(4,3,sum));
        System.out.println(myCalculator.operate(4,3,prod));
        System.out.println(myCalculator.operate(4,3,diff));
        System.out.println(myCalculator.operate(4,3,div));

    }
    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}