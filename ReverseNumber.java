import java.util.Scanner;
public class ReverseNumber
{
  public static void main(String[]arg)
    {
      int n,d,r=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter an Integer:");

      n= sc.nextInt();
      while(n>0)
      {
          d=n%10;
          r=r*10+d;
          n=n/10;
      }
      System.out.println("Reverse of digits:"+r);


    }


}
