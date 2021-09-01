class shape
{
    int l,b;
    void setdata(int m,int n)
    {
        l=m;
        b=n;
    }
    void area()
    {
        System.out.println("Area can be calculated for shape only");
    }
}
class Rectangle extends shape{
    void area()
    {
        float ar=l*b;
        System.out.println("Area of rectangle:"+ar);
    }
}
class Triangle extends shape
{
    void area()
    {
        float ar=l*b/2.0f;
        System.out.println("Area of rectangle:"+ar);
    }
}

public class Dynamicmethoddispatch {
    public static void main(String[]arg)
    {
        shape s;
        s=new Rectangle();
        s.setdata(8,4);
        s.area();
        s=new Triangle();
        s.setdata(4,3);
        s.area();

    }
}
