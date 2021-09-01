import java.util.Scanner;

class ExceptionHandling_try {
    public static void main(String[] arg) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        a = sc.nextInt();
        System.out.println("Enter second no");
        b = sc.nextInt();
        try {

            c = a / b;
            throw new ArithmeticException();
        }
        catch(ArithmeticException ae)
        {

        }
        System.out.println("After exception handle");

    }
}
