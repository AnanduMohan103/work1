import java.util.Scanner;
public class Biggestnumber
{
    public static void main(String args[])
    {
       int m,n,o,p;
       Scanner s =new Scanner(System.in);
       System.out.println("Enter the first number");
       m=s.nextInt();
       System.out.println("Enter the second number");
       n=s.nextInt();
       System.out.println("Enter the third number");
       o=s.nextInt();
       p=o>(m>n?m:n)?o:(m>n?m:n);
       System.out.println("The biggest number:"+p);
    }
}


    
