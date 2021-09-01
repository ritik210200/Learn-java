public class SwitchcCaseWrapperclassCharacter {
    public static void main(String[] arg) {


        Character ch=new Character('B');
        switch (ch) {
            case 'A':
                System.out.println("One");
                break;
            case 'B':
                System.out.println("Two");
                break;
            case 'C':
                System.out.println("Three");
                break;
            default:
                System.out.println("Something else");
        }
        System.out.println("Program ends");
    }
}

