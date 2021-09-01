 class MatrixAddition
{
    void printMat(int[][] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    void addMat (int[][] a, int[][] b,int[][] c)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
                c[i][j] = a[i][j] + b[i][j];
        }
    }
    public static void main(String[] args)
    {
        int[][] mat1= { { 1, 3 }, { 2, 4 } };
        int[][] mat2= { { 1, 1 }, { 1, 1 } };
        int[][] mat3=new int[2][2];
        MatrixAddition ob= new MatrixAddition();
        System.out.println("The sum is ");
        ob.addMat(mat1, mat2,mat3);
        ob.printMat(mat3);
    }
}