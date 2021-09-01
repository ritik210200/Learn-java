class c1
{
    int a;
    c1()                //No argument constructor
    {
        System.out.println("constructing class c1");
        a=1;
    }
    c1(int k)
    {
        System.out.println("constructing class c1 thru parametrised constructor");
        a=k;
    }
}
class c2 extends c1
{
    int b;
    c2()
    {
        System.out.println("constructing class c2");
        b=2;
    }
    c2(int i,int j)
    {
        super(i);   //super class constructor is called
        System.out.println("constructing class c2 thru parametrised constructor");
        b=j;
    }
}
class c3 extends c2 {
    int c;
    c3()
    {
        System.out.println("constructing class c3");
        c=3;
    }
    c3(int i,int j,int k)
    {
        super(i,j);
        System.out.println("constructing class c3 thru parametrised constructor");
        c=k;
    }
    void disp()
    {
        System.out.println("Values are:"+a+","+b+" and "+c);
    }
}
public class ConstructorinInheritance {
    public static void main(String[]arg)
    {
        c3 obj1=new c3(7,8,9);
        obj1.disp();
    }
}
