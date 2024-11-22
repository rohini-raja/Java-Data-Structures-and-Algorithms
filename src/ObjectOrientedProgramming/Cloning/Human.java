package ObjectOrientedProgramming.Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{2,5,6,7,8,3,2};
    }

//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }

    // This is a shallow copy
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

      //this is deep copy
    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone(); // this is actually shallow copy

        //make a deep copy
        twin.arr = new int[twin.arr.length];
        for(int i = 0; i < twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        // System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);
        return twin;
    }
}
