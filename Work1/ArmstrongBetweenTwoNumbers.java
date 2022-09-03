import java.util.Scanner;
public class ArmstrongBetweenTwoNumbers {
   public static void main(String args[]){
      int start, end;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the start number ::");
      start = s.nextInt();
      System.out.println("Enter the end number ::");
      end = sc.nextInt();
      for (int i = start; i<end; i++){
         int n, rem, sum = 0;
         n = i;
         while(n != 0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
         }
         if(sum == i){
          System.out.println(""+i+" is an Armstrong number.");
       }
    }
 }
}