package ObjectOrientedProgramming.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //also working as an index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        //copy the current items in the new array
        for(int i = 0; i < data.length; i++){
           temp[i] = data[i];
        }
        data = temp;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    private boolean isFull() {
       return size == data.length;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
     //   ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
      for(int i = 0; i < 14; i++){
          list.add(2*i);
      }
        System.out.println(list);
        /* Trying and implementing all these
        list.add(45);
        list.remove(0);
        list.get(0);
        list.set(1,3456);
        list.size();
        list.isEmpty();
         */

    }
}
