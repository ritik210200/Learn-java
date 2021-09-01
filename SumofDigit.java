// sum of digits and reverse of a number .
import java.util.Scanner;
class SumDigit{
    int sumofdigits(int n)
    {
       int d,s=0;
       while(n>0)
       {
           d=n%10;
           s=s+d;
           n=n/10;
       }
       return s;
    }
    int revNum(int n)
    {
        int d,r=1;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        return r;
    }
}
public class SumofDigit {
    public static void main(String[]arg)
    {
      Scanner sc=new Scanner(System.in);
      SumDigit sd=new SumDigit();
      System.out.println("Enter a number");

      int num=sc.nextInt();
      int k=sd.sumofdigits(num);
      System.out.println("Sum of digits:"+k);
      int n=sc.nextInt();
      int rv=sd.revNum(n);
      System.out.println("Reverse of number:"+rv);

    }
}
