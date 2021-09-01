import java.util.Scanner;
public class StudentGrade {
    public static void main(String []arg)
    {
        int a,b,c;
        float avg;
        char gr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1:");
        a=sc.nextInt();
        System.out.println("Enter number2:");
        b=sc.nextInt();
        System.out.println("Enter number3:");
        c=sc.nextInt();
        avg=(a+b+c)/3.0f;
        if(avg>=90)
            gr='O';
        else if(avg>=80)
            gr='E';
        else if(avg>=70)
            gr='A';
        else if(avg>=60)
            gr='B';
        else if(avg>=50)
            gr='c';
        else
            gr='F';
        System.out.println("Average:"+avg);
        System.out.println("Grade:"+gr);






    }
}
