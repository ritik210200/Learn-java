import java.io.*;
class XY
{
    void change() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //read data from keyboard
        int a=Integer.parseInt(br.readLine());             //IO Exception may be generated
        int b=Integer.parseInt(br.readLine());
        int c=a/b;
        //throw new IllegalAccessException();
        System.out.println("The result:"+c);
    }
}


public class CheckedException {
    public static void main(String arg[])
    {
        XY de=new XY();
        try
        {
            de.change();
        }
        catch(ArithmeticException ae)
        {
            System.out.println("arithmetic problem");
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Please provide in numeric format");
        }
        catch(IOException ia)
        {
            System.out.println("Some problem occurred during reading data from KB");
        }
    }
}

