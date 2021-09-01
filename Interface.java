interface Fourwheeler
{
    int s=40;   // final,static ,public
    void fspeed(); //method is public,abstract
    void sspeed();
    void move();
    //void setS(int k);
}                                                     //class-class(extends)



class Indica implements Fourwheeler
{                                                    //interface --class(interface keyword)  otherwise

                                                       // interface---interface(extends)

    public void fspeed()
    {
        System.out.println("i can move at speed of "+s+"km/hr");
    }
    public void sspeed()
    {
        System.out.println("I can run at 60km/hr");
    }
    public void move()
    {
        System.out.println("I can move by myself");

    }
    /*public void setFS(int k)
    {
       Sp=k;
       }

     */

}

public class Interface {
    public static void main(String[]arg)
    {
        Fourwheeler in=new Indica();
        in.move();
        in.fspeed();
        in.sspeed();
        //in=new Fiat();     //runtime polymorphism
        //in.fspeed();

    }

}
