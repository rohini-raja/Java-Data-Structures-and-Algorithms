package ObjectOrientedProgramming.Enumexample;

public class Basic {
    enum Week {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        //these are enum constants
        // public,static and final members
            /* since its final, you can create child enums
            type is week
             */
        Week(){
            System.out.println("Constructor called for "+ this);
        }
        //this is not public or protected, only private or default
        //why? - we dont want to creat new objects
        //this is not the enum concept, thats why
        //internally:  public static final Week Monday = new Week();
    }
    public static void main(String[] args) {
        Week week;
        week = Week.MONDAY;

//        for( Week day : Week.values()) {
//            System.out.println(day);
//        }
    }
}
