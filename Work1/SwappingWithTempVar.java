import java.util.Scanner;
public class SwappingWithTempVar {
    public static void main(String args[])
    {
        int x,y,temp=0;
        System.out.println("Enter the two numbers for swapping");
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt(); 
        temp=0;
        System.out.println("The numbers before swapping: "+x+" "+y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("The numbers after swapping: "+x+" "+y);
    }
    


}
