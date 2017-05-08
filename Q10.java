
import java.util.Scanner;


public class Q10 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
      System.out.println("please inter value of x: ");
      double x = t.nextDouble();
       System.out.println("please inter value of y: ");
      double y = t.nextDouble();
        if(x>0&&x>y)
        System.out.println("equation1= "+(x*x+2*y));
        else if(x<0&&x<=y)
         System.out.println("equation2= "+(x+15*y));
           else if(x==0)
         System.out.println("equation3= "+(x-y*y*y));
           else{
       
    }
   
}}
