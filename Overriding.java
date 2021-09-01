class parent
{
    void disp()
    {
        System.out.println("I am from parent class");
    }
    void show()
    {
        System.out.println("I am from show() of parent class");
    }

}
class child extends parent
{
    void disp()
    {
        System.out.println("I am from derived class");
        System.out.println("I am overriden");
    }
}
public class Overriding {
    public static void main(String[]arg)
    {
        parent ref;
        ref=new parent();
        ref.disp();  //super version
        ref=new child();
        ref.disp();  //subclass version
    }
}
