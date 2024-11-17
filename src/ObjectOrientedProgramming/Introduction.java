package ObjectOrientedProgramming;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {
//        int[] numbers = new int[10];
//        String[] name = new String[10];


        Student[] students = new Student[5];
 //      Student Rohini;
//        Rohini = new Student();
        Student Rohini = new Student(25351,"Rohini", 99.8f);
        Student Raja = new Student(25352,"Rajasimman",92.5f);
        Student Mangai = new Student();
//        Rohini.name = "Rohini";
//        Rohini.rno = 25351;
//        /Rohini.marks = 90f;
        System.out.println("Printing the student" + Rohini);
        System.out.println(Rohini.marks);
        System.out.println(Rohini.name);
        System.out.println(Rohini.rno);
        Rohini.changeName("Rooo");
        Rohini.greeting();
        System.out.println("Printing the student" + Raja);
        System.out.println(Raja.marks);
        System.out.println(Raja.name);
        System.out.println(Raja.rno);
        System.out.println("Printing the student" + Mangai);
        System.out.println(Mangai.marks);
        System.out.println(Mangai.name);
        System.out.println(Mangai.rno);
      //  System.out.println(Arrays.toString(students));

        Student one = new Student();
        Student two = one;

        one.name = "Heeman";
        System.out.println(one.name);
        System.out.println(two.name);
    }
}


class Student{
//    int[] rno = new int[10];
//    String[] name = new String[10];
//    float[] marks = new float[10];
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hi, I am "+ this.name);
    }
    void changeName(String name){
        this.name = name;
    }
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
    Student(){
        this(23,"Mangai",34.5f);
    }
}
