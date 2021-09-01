/* super class reference access super class version member through it is
initialized to sub-class object.
 */

class A
{
    int x;
    void disp()
    {
        System.out.println("From class A");
    }
}
class B extends A{
    int y;
    void disp1()
    {
        System.out.println("From class B");
    }
}

public class Reference {
    public static void main(String[]arg)
    {
        A ref;              //sub class object is defined from superclass reference
        ref=new B();
        ref.disp();         //ref.disp1() will show error

    }
}
