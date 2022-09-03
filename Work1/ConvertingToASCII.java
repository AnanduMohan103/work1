import java.util.Scanner;

public class ConvertingToASCII {
    public static void main(String args[])
    {
        char value;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character:");
        value = s.next().charAt(0);
        int ASCII = value;
        System.out.println("The ASCII value of " +value + " is: " + ASCII);

    }
}
