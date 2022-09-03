import java.util.Scanner;
public class SwappingWOTempVar {
    public static void main(String args[])
    {
        int x,y;
        System.out.println("Enter the two values for swapping:");
        Scanner s = new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        System.out.println("The numbers before swapping: "+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("The numbers after swapping: "+x+" "+y);
    }

    
}
