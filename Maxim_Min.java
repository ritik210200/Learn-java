import java.util.Scanner;
class Max_Min
{
    public static void main (String[] arg)
    {
        int[] arr;
        int mx=0,mn=99990;
        arr = new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Element-" + (i+1) +":");
            arr[i]=sc.nextInt();
            if(arr[i]>mx)
                mx=arr[i];
            if(arr[i]<mn)
                mn=arr[i];
        }
        for(int i=0;i<arr.length;i++)
            System.out.println("Element at index " + i +" :"+arr[i]);
        System.out.println("Min value :" + mn);
        System.out.println("Max value :" + mx);
    }
}


