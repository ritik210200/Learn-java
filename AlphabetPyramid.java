 /*   A
    A B A       Alphabet Pyramid
  A B C B A
A B C D C B A
  */
public class AlphabetPyramid {
    public static void main(String[]arg) {
        int r = 1, c = 1;
        for (r = 1; r <= 4; r++) {
            for (c = 1; c <= r; c++) {
                if ((r + c) == 5)
                    System.out.print("A");
                else if ((r + c) == 6)
                    System.out.print("B");
                else if ((r + c) == 7)
                    System.out.print("C");
                else if ((r + c) == 8)
                    System.out.print("D");

            }
            System.out.println();
        }



    }
}
