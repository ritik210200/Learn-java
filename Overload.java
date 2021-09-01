import java.util.Scanner;
public class Overload {
    int add(int a,int b)
    {
        System.out.println("First version is overloaded");
        int c;
        c=a+b;
        return c;
    }
    float add(float a,float b)
    {
        System.out.println("Second version is overloaded");
        float c;
        c=a+b;
        return c;

    }
    void disp()
    {
        System.out.println("Java programming");
    }
    void disp(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println("programming java"+i);
        }

    }
    public static void main(String[]arg)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer:");
        n=sc.nextInt();
        Overload ob=new Overload();
        int k=ob.add(4,5);
        System.out.println("sum is:"+k);
        float j=ob.add(4.5f,5.5f);
        System.out.println("sum is:"+j);

        ob.disp();
        ob.disp(n);

    }

}
