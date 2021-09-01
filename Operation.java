public class Operation {
    public static void main(String[]args)
    {
        System.out.println("-63%4="+(-63%4)); //Arithmetic operator
        System.out.println("-63%-4="+(-63%-4));

        int a=56,b=34,d=58;
        boolean c=a>b;
        System.out.println("value of c="+c);
        c=a<=b; //Relational operator
        System.out.println("value of c="+c);
        c=a!=b;
        System.out.println("value of c="+c);
        c=a>b && d<=b; //Logical (And)
        System.out.println("value of c="+c);
        c=a>b || d<=b; //Logical (OR)
        System.out.println("value of c="+c);
        int p=a&b; //Bitwise operator
        System.out.println("value of p="+p);
       int q=a|b;
        System.out.println("value of q="+q);
        int r=6,x=4;
       int y=~r;
        System.out.println("value of y="+y);
        int t=r^x; //XOR
        System.out.println("value of t="+t);
        int k=-19; //shift operator
        int j=k>>1;
        int l=k>>2;
        int o=k<<2;
        System.out.println("After shift="+j);
        System.out.println("After shift="+l);
        System.out.println("After shift="+o);
        int s=4,h=1,g=4; //Ternary operator
        int n=s>h?h+1:g-1;
        System.out.println("value of n="+n);
        n=h=g<<1; //Assignment operator
        System.out.println("value of n="+n);


    }
}
