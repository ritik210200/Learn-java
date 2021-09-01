class A
{
    int a;
    A(int a)
    {
        System.out.println("From A class constructor");
        this.a=a;
    }
    void disp()
    {
        System.out.println("value of a="+this.a);
    }
}
class B extends A
{
    int b;
    B(int m,int n)
    {
        super(m);  // super as constructor
        System.out.println("From B class constructor");
        b=n;
    }
    void disp2()
    {
       super.disp();  //super as reference
    }
}

public class superasrefconstr {
    public static void main(String[]arg)
    {
        B ob=new B(4,6);
        ob.disp();
    }
}
