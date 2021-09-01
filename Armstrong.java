import java.util.Scanner;
public class Armstrong {
    public static void main(String[]arg)
    {
        int n,d,s=0;
        int t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer:");

        n= sc.nextInt();
        t=n;
        while(n>0)
        {
            d=n%10;
            s=s+d*d*d;
            n=n/10;
        }
        if(t==s)
        System.out.println("The number is Armstrong"+s);
        else
            System.out.println("The number is not Armstrong");


    }

}
