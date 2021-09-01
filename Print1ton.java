import java.util.Scanner;
public class Print1ton {
    public static void main(String[] args) {
        int n,i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");

         n = sc.nextInt();
        System.out.println("Numbers are:");
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }

    }
}
