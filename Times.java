/* 
    Name:         Mary Y. Yu
    Email:        thom01@gmail.com
    Compilation:  javac Times.java
    Execution:    java Times
    Dependencies: No known dependencies. 
    Description:  This program algorithmically generate the following 
                  matrix (2D array) ofnumbers. 
                     
                           0  1  2  3  4  5  6  7  8  9 
                        0  0  0  0  0  0  0  0  0  0  0
                        1  0  1  2  3  4  5  6  7  8  9    
                        2  0  2  4  6  8 10 12 14 16 18
                        3  0  3  6  9 12 15 18 21 24 27
                        4  0  4  8 12 16 20 24 28 32 36
                        5  0  5 10 15 20 25 30 35 40 45
                        6  0  6 12 18 24 30 36 42 48 54
                        7  0  7 14 21 28 35 42 49 56 63
                        8  0  8 16 24 32 40 48 56 64 72
                        9  0  9 18 27 36 45 54 63 72 81
    
*/

class Times
{
    public static void main(String[] args)
    {
        // Declare a 10 by 10 2D Array. Array are by default set to "0"
        // so initializtion to "0" is not required,
        int[][] matrix = new int[10][10];
        
        // Nested "for loop" for the algorithm to generate the desired values.
        for (int i  = 0;  i < 10; i++)
        {
            // Generate diagonal values.
            int d = (i * i);
            matrix [i][i] = d;
                // with the diagonal value, generate the rest of the values.
                for (int j = i+1; j < 10; j++)
                {
                    matrix [i][j] = matrix [i][j-1] + i;    // fill row from diagonal
                    matrix [j][i] = matrix [j-1][i] + i;     //fill column starting from diagonal

                }
        }
        //Display of the matrix (2D arrays) and its columns and rows indexes.
        
        //Print the matrix column index.
        System.out.print("\n\n");
        System.out.printf("%8d%4d%4d%4d%4d%4d%4d%4d%4d%4d\n", 
                            0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
                            
        //Display the row index and content of the matrix
        for (int k = 0; k < 10; k++)
        {
            System.out.printf("%4d", k);                
            for (int l = 0; l < 10; l++)
            {
                System.out.printf("%4d", matrix[l][k]);
            }
            System.out.println();                                        
        }
        System.out.println();        
    }
}
