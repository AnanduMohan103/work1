public class BiggestOfTwoNumOneLineCode {
    public static void main(String args[])
    {
        int n=10,o=20,p=16,q;
        q=n>(o>p?o:p)?n:(o>p?o:p);
        System.out.println("The bigger number is:"+q);

    }
}
