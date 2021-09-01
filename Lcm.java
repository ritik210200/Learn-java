import java.util.Scanner;
class Leastcommonfactor {

    int n1, n2, gcd = 1, lcm = 1;

    int LCM(int n1, int n2) {
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;


            }
            lcm = (n1 * n2) / gcd;
        }

        return lcm;

    }

}

    public class Lcm {
        public static void main(String[] arg) {
            int n1, n2;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number n1:");
            n1 = sc.nextInt();
            System.out.println("Enter number n2:");
            n2 = sc.nextInt();
            Leastcommonfactor ob=new Leastcommonfactor();
            int k=ob.LCM(n1,n2);   //function call
            System.out.println("Lcm is:"+k);


        }
    }


