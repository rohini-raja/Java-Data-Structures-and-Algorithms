package ObjectOrientedProgramming.Generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student Rohini = new Student(9781,99.3f);
        Student Mangu = new Student(9780,99.2f);
        Student Raja = new Student(9837,95.3f);
        Student Arul = new Student(9782,79.3f);
        Student Vishnu = new Student(2348,89.3f);
        Student Pugazh = new Student(9784,85.3f);

        Student [] list = {Rohini,Mangu,Raja,Arul,Vishnu};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
//        if(Rohini.marks < Mangu.marks) {
//            System.out.println("Mangu has more marks");
//        } else {
//            System.out.println("Rohini has more marks");
//
//        }
        if(Rohini.compareTo(Mangu) < 0) {
            System.out.println("Rohini");
        }

    }
}
