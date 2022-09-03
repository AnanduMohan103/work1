import java.util.Scanner;
public class ReversingNumber 
{  
public static void main(String args[])   
{  
System.out.println("Enter the number that you want to reverse: ");  
Scanner s = new Scanner(System.in);  
int n = s.nextInt();    
int reverse = 0;
while(n!= 0)   
{  
int remainder = n % 10;  
reverse = reverse * 10 + remainder;  
n = n/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
} 
}