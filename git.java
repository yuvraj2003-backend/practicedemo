import java.util.*;
public class git {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      System.out.println("ENTER YOUR ANNUAL INCOME:");
       int N=sc.nextInt();
        if(N <= 200000) {
            System.out.println("BELOW POVERTY");
      }
      else {
        System.out.println("NOT BELOW POVERTY");
 }
    
    } 
}