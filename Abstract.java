abstract class Abs
{
    abstract void show();
    void disp()
    {
        System.out.println("concrete method in Abs");
    }
}

class concrete1 extends Abs{
    void show()
    {
        System.out.println("My class is concrete");

    }
}
class concrete2 extends Abs {
    void show() {
        System.out.println("My class is concrete2");

    }
}
public class Abstract {
    public static void main(String[]arg)
    {
        Abs r=new concrete1();
        r.show();
         r=new concrete2();
        r.show();

    }
}
