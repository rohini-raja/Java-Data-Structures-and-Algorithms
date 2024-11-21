package ObjectOrientedProgramming.Inheritance;
public  class Box {
    double length;
    double width;
    double height;
    static void greeting(){
        System.out.println("Hey, im in box class");
    }
    Box() {
        super();
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }
    Box(double length, double width, double height) {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }
    //cube
    Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(Box old){
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;
    }

    public void information(){
        System.out.println("Running the box");
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
    }
}

