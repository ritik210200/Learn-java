import java.util.Scanner;

class trycatch {
    public static void main(String[] arg) {
        int a,b,c;
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        a = sc.nextInt();
        System.out.println("Enter second no");
        b = sc.nextInt();
        c=a/b;
        System.out.println("The result is:"+c);
        }
        catch(ArithmeticException ae)                 //catch ArithemticException is its subclass
        {
            System.out.println("you cannot divide by 0");
            System.out.println("Read another value of b");
        }
        System.out.println("After exception handle program ends here");
    }
}
