
import java.util.Scanner;


public class Q11 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("put number");
        double num = in.nextInt();
        double K = 1;
        while(num > 0){
            K = K * num;
            num--;
        }
        System.out.println("Multiplied by the number="+K);
    }
    }
 
