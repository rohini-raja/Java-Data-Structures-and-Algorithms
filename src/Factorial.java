import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int total = scanner.nextInt();
        int factorialop = 1;
        for(int i=0;i<total;i++){
            int f = scanner.nextInt();
            for(int j=1;j<=f;j++){
                factorialop = factorialop*j;
            }
            System.out.println(factorialop);
        }
    }
}
