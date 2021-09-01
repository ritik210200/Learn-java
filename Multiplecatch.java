class Multiplecatch {
    public static void main(String arg[])
    {
        int a,b,c;
        try {
            a=Integer.parseInt(arg[0]);
            b=Integer.parseInt(arg[1]);
           /*Explicit throw if(b==0)
            {
                System.out.println("I am in b=0");
                RuntimeException ae=new  RuntimeException();
                throw ae;
            }

            */
            System.out.println("*********");
            c=a/b;
            System.out.println("The result is:"+c);

        }
        catch(ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("Please provide two arguments");
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Number can not be alphabet or negative");
        }

        catch(ArithmeticException ae)
        {
            System.out.println("2nd number cannot be zero");
        }
        System.out.println("After Exception handle");
    }
}
