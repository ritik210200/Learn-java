import java.util.Scanner;
public class SumDigit {
    public static void main(String[] args) {
        int n, d,s= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");

        n = sc.nextInt();
        while (n > 0)
        {
           d=n%10;
           s=s+d;
           n=n/10;
        }
        System.out.println("Sum of digits:"+s);

    }
}
