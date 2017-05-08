
import java.util.Scanner;


public class Q5 {
    public static void main(String[] args) {
        Scanner K = new Scanner(System.in);
   System.out.println("Enter the number");
   int num = K.nextInt();
   String num_ = num +"" ;
    
  System.out.println(num_.substring(num_.length()-1));
    System.out.println(num_.charAt(num_.length()-2));
    System.out.println(num_.charAt(num_.length()-3));


    }
  
}
