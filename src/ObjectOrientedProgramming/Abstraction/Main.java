package ObjectOrientedProgramming.Abstraction;
/*
Abstraction - hiding unnecessary details and sharing valuable information
Design level, focus on external stuff
process of gaining info
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Abstraction");
        Son son = new Son(26);
//        son.career("Engineer");
        son.career();

        Daughter daughter = new Daughter(25);
        daughter.career();
    }
}
