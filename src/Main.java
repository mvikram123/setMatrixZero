public class Main
{


    static void modifyMatrix(int mat[][], int R, int C){
        int i,j;
        int row[]=new int[R];
        int col[]=new int[C];


        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (mat[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        /* Modify the input matrix mat[] using the
        above constructed row[] and col[] arrays */
        for (i = 0; i < R; i++)
            for (j = 0; j < C; j++)
                if (row[i] == 1 || col[j] == 1)
                    mat[i][j] = 1;
    }

    /* A utility function to print a 2D matrix */
    public static void printMatrix(int mat[][], int R,
                                   int C)
    {
        int i, j;
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int mat[][] = {
                { 1, 0, 0, 1 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
        };

        System.out.println("Matrix Initially");
        printMatrix(mat, 3, 4);
        modifyMatrix(mat, 3, 4);
        System.out.println("Matrix after modification");
        printMatrix(mat, 3, 4);
    }
}

//output=  1 1 1 1
 //        1 1 1 1
 //        1 0 1 1