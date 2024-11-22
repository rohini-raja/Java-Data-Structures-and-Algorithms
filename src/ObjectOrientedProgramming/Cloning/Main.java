package ObjectOrientedProgramming.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Rohini = new Human(25,"Rohini Rajasimman");
      //  Human twin = new Human(Rohini); //Take some time
        /* clone is actually a method in object class which is used in making clones,
        in lang - clonable
         */
        Human twin = (Human) Rohini.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));
        //Shallow copy - primitives will be copied as it is, reference variable it will point to the same object.
        twin.arr[0] = 200;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(Rohini.arr));

        //Deep copy - creates a copy and copy into it, solves the issues in shallow copy.
    }
}
