import java.util.Scanner;

public class Lcmoftwonos {
    public static void main(String[]arg) {
        Scanner sc = new Scanner(System.in);
        int k, i, n1, n2,gcd=1,lcm=1;
        System.out.println("Enter number n1:");
        n1 = sc.nextInt();
        System.out.println("Enter number n2:");
        n2= sc.nextInt();
        for (i = 1; i <= n1 && i<=n2; i++) {
            if(n1%i==0 && n2%i==0) {
                gcd=i;



            }
            lcm=(n1*n2)/gcd;

        }
        System.out.println("Lcm of two numbers n1 and n2 is"+lcm);
    }

}





