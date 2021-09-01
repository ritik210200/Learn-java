import java.util.Scanner;
class ArrExa
{
    void findMinMax(int a[])
    {
        int mn,mx;
        mn=mx=a[0];
        for (int i = 1; i < a.length; i++)
        {
            if(a[i]>mx)
                mx=a[i];
            if(a[i]<mn)
                mn=a[i];
        }
        System.out.println("Min value :" + mn);
        System.out.println("Max value :" + mx);
    }
}
class PassingarrayasArgument
{
    public static void main (String[] arg)
    {
        int[] arr;
        arr = new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Element-" + (i+1) +":");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
            System.out.println("Element at index " + i +" :"+arr[i]);
        ArrExa ae=new ArrExa();
        ae.findMinMax(arr);
    }
}
