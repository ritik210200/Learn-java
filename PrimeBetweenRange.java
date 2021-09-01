import java.util.Scanner;
public class PrimeBetweenRange {
    public static void main(String[]arg) {
                Scanner sc = new Scanner(System.in);
                int k, i, n1, n2, flag = 1; // can use flag=true
                System.out.println("Enter number n1:");
                n1 = sc.nextInt();
                System.out.println("Enter number n2:");
                n2= sc.nextInt();
                for (k = n1; k <= n2; k++) {
                    flag=1;

                    for (i = 2; i <= Math.sqrt(k); i++)  // can use i<=n/2
                    {
                        if (k % i == 0) {
                            flag = 0;
                            break;
                        }
                        if (flag == 1)
                            System.out.println(k+" ");

            }
        }
    }

}



