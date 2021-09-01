class StringMethods {
    public static void main(String arg[])
    {
        byte asc[]={65,66,67,68,69,70};
        char chr[]={'b','b','s','r'};

        String st1="University";
        String st2=new String(chr);
        String st3=new String(asc);
        String st4=new String(chr,1,3);
        String st5=new String(asc,1,4);
        String st6= "College";

        System.out.println("Lenght of the st1:"+st1.length());
        System.out.println("Object itself is:"+st1.toString());
        System.out.println("Character at 3 is:"+st1.charAt(3));
        System.out.println("3rd byte in byte array of st6:"+st6.getBytes()[2]);
        System.out.println("St1 is equal to st6:"+st1.equals(st6));
        System.out.println("Index of  B in st3:"+st3.indexOf('B'));
        System.out.println("SubString of st6 from 2 to 5:"+st1.substring(2,5));
        System.out.println(8+st1);
        System.out.println('t'+8+st1);
        st6=st6.toUpperCase();
        System.out.println(st6);
        System.out.println(st4);
    }
}
