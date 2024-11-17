import java.util.Scanner;

public class Sumproduct {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int total = scanner.nextInt();
        for(int i=0;i<total;i++){
            int val = scanner.nextInt();
            int givenval = val;
            int sum = 0;
            int product = 0;
            while(val>0){
                int lastdig = val %10;
                sum+=lastdig;
                if(product==0){
                    product+=lastdig;
                }else{
                    product*=lastdig;
                }
                val = val/10;
            }
            if((sum*product)==givenval) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
