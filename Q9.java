
import java.util.Scanner;


public class Q9 {
    public static void main(String[] args) {
        
   Scanner K = new Scanner(System.in);
   System.out.println("Enter the value of Financial bill ");
   double value= K.nextInt();
   if(value>500)
   
  System.out.println("value of Financial bill= "+(value-value*0.1));
  else if(value<=500&& value >=100 )
  System.out.println("value of Financial bill= "+(value-value*0.05));
  else 
  System.out.println("value of Financial bill= "+(value-value*0.03));
    }
   
}
