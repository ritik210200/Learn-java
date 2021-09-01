import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,flag=1; // can use flag=true
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=2;i<=Math.sqrt(n);i++)  // can use i<=n/2
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
            if(flag==1)
                System.out.println("The number is prime"+n);
            else
                System.out.println("The number is not prime"+n);
        }
    }

}
