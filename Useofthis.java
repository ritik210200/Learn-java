class UseThis
{
    int a;
    int b;
    UseThis() //No argument constructor
    {
        a=1;
        b=1;
    }
    UseThis(int a)
    {
        System.out.println("in second");
        this.a=a;
    }
    UseThis(int a,int b)
    {
        //System.out.println("in third");
        this(a);
        System.out.println("in third");
        this.b=b;
    }
    void setval(int a,int b)
    {
        System.out.println("inside method");
        this.a=a;
        this.b=b;
    }
}
public class Useofthis {
    public static void main(String[]arg)
    {
        System.out.println("the values are:");
    }
}
