package ObjectOrientedProgramming.Access;

public class Objectdemo {
    public Objectdemo(int num) {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Objectdemo obj = new Objectdemo(34);
        System.out.println(obj);
        System.out.println(obj.hashCode()); //random integer function in java

    }
}

