import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[]arg)
    {
        int t1=0,t2=1,tn,n,c=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of terms:");
        n=sc.nextInt();
        System.out.println(t1);
        System.out.println(t2);
        while(c<n)
        {
            tn=t1+t2;
            System.out.println(tn);
            t1=t2;
            t2=tn;
            c++;
        }
    }
}
