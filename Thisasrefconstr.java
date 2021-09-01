class x
{
    int a;
    x()
    {
        a=1;
    }
    x(int a)
    {
        this.a=a;
    }
    void disp()
    {
        int a=7;
        System.out.println("value of a="+this.a);
    }
}

public class Thisasrefconstr {
    public static void main(String[]arg)
    {
        x ob=new x(6);
        ob.disp();
    }
}
