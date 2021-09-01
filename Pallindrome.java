import java.util.Scanner;
public class Pallindrome {
    public static void main(String[]arg) {
        int n, d, r = 0;
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer:");

        n = sc.nextInt();
        t = r;
        while (n > 0) {
            d = n % 10;
            r = r*10+d;
            n = n / 10;
        }
        if (t == r)
            System.out.println("The number is Pallindrome" + r);
        else
            System.out.println("The number is not Pallindrome");
    }



    }
