class Table
{
    int l;
    int b;
    int h;
    void setprop(int ln,int br,int ht)  //parametrised constructor
                                        //void setprop() is no argument constructor
    {
        l=ln;
        b=br;
        h=ht;

    }
    void dispprop()
    {
        System.out.println("length:"+l);
        System.out.println("breadth:"+b);
        System.out.println("height:"+h);

    }
}
public class Tab {
    public static void main(String[]arg)
    {
        Table tb=new Table(); //no argument constructor
        tb.setprop(3,2,4);
        tb.dispprop();
        Table t2=new Table();
        t2.setprop(7,8,9);
        tb.dispprop();


    }
}
