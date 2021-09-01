import java.util.Scanner;
class MultiplicationTable
{
    public static void main(String args[])
    {
        int n, c;
        System.out.println("Enter an integer to print it's multiplication table");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Multiplication table of " + n);

        for (c = 1; c <= 10; c++)
            System.out.println(n + "*" + c + " = " + (n*c));
    }
}


