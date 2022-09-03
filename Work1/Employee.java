import java.util.Scanner;
public class Employee {
    double total;
    public  void result (double t1, double t2, double t3) 
    {
       if (t1>=75&&t2>=75&&t3>=75) {
        System.out.println("!!Promoted!!");
        
       } else {
        System.out.println("**Demoted**");
        
       }        
    }
    public void average(double t1, double t2, double t3) {
        total=t1+t2+t3;
        System.out.println("Total:"+total);
        double average=total/3;
        System.out.println("Average:"+average);
        
    }
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the name and id:");
    String name=s.nextLine();
    int id=s.nextInt();
    System.out.println("Enter the marks:");
    double m1=s.nextDouble();
    double m2=s.nextDouble();
    double m3=s.nextDouble();
 Employee obj =new Employee();
    obj.result(m1,m2,m3);
    obj.average(m1,m2,m3);   
}
    
}

