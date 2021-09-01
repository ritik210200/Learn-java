import java.util.Scanner;
public class LeapYear {
    public static void main(String[]arg)
    {
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        c= sc.nextShort();

                if((c%4==0 && c%100!=0 ) || c%400==0)
                {
                    System.out.println(c+"is a leap year");
                }
                else
                {
                    System.out.println(c+"is not a leap year");
                }
                System.out.println("Program ends");
    }
}
