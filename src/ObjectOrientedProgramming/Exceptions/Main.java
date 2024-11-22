package ObjectOrientedProgramming.Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
       // int c =  a/b;
        try {
           divide(a,b);
        }
        // More strict rules to be added from above.
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal exception");
        }
        finally {
            System.out.println("finally");
        }
    }
    static int divide(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Dont divide by zero");
        }
        return a/b;
    }
}
