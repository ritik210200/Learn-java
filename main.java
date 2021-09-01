 class main {
    public static void main(String[]arg) {
        byte b[]={97,98,99,100,101};
        String st=new String(b);
        String st1=new String(b,1,3);
        String st2=new String(st1);
        System.out.println("Second String:"+st);
        System.out.println("Second String:"+st1);
        System.out.println("Second String:"+st2);


        char ch[] = { 'i','i' ,'t','k','g','p'};
        String s1=new String(ch);
        String s2=new String(ch,1,3);
        System.out.println("First String:"+s1);
        System.out.println("Second String:"+s2);
    }
}
