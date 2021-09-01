import java.util.Scanner;

public class BinaryEquivalent {

        public static void main(String[]arg) {
            int n, d, b = 0,p=1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an Integer:");

            n = sc.nextInt();
            while (n > 0) {
                d = n % 2;
                b=b+d*p;
                n = n / 2;
                p=p*10;
            }

                System.out.println("The Binary equivalent is:"+b);


        }



    }


