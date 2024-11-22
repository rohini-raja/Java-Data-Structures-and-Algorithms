package ObjectOrientedProgramming.Generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Rohini = new Student(9781,99.35f);
        Student Mangu = new Student(9780,99.2f);
        Student Raja = new Student(9837,95.3f);
        Student Arul = new Student(9782,79.3f);
        Student Vishnu = new Student(2348,89.3f);
        Student Pugazh = new Student(9784,85.3f);

        Student [] list = {Rohini,Mangu,Raja,Arul,Vishnu};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>(){
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks);
//            }
//        }); - instead of this we can use lambda expressions
        Arrays.sort(list, (o1,o2) -> (int)(o1.marks - o2.marks));
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
