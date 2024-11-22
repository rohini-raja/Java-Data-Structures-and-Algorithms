package ObjectOrientedProgramming.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(3);


        System.out.println(list);
        System.out.println(list2);
    }
}
