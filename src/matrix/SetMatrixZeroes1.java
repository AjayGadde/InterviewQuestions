package matrix;

public class SetMatrixZeroes1 {


    public static void main(String[] args) {
        SetMatrixZeroes1 setMatrixZeroes1 = new SetMatrixZeroes1();
        int[][] matrix = new int[3][3];
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 1;

        matrix[1][0] = 1;
        matrix[1][1] = 1;
        matrix[1][2] = 0;

        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 0;

        for(int i=0; i< 3; i++){
            System.out.println();
            for(int j=0; j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }


        System.out.println("**********************");
        setMatrixZeroes1.setZeroes(matrix);

    }



        public void setZeroes(int[][] matrix) {
            Boolean isCol = false;
            int R = matrix.length;
            int C = matrix[0].length;

            for (int i = 0; i < R; i++) {

                // Since first cell for both first row and first column is the same i.e. matrix[0][0]
                // We can use an additional variable for either the first row/column.
                // For this solution we are using an additional variable for the first column
                // and using matrix[0][0] for the first row.
                if (matrix[i][0] == 0) {
                    isCol = true;
                }

                for (int j = 1; j < C; j++) {
                    // If an element is zero, we set the first element of the corresponding row and column to 0
                    if (matrix[i][j] == 0) {
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }

            // Iterate over the array once again and using the first row and first column, update the elements.
            for (int i = 1; i < R; i++) {
                for (int j = 1; j < C; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // See if the first row needs to be set to zero as well
            if (matrix[0][0] == 0) {
                for (int j = 0; j < C; j++) {
                    matrix[0][j] = 0;
                }
            }

            // See if the first column needs to be set to zero as well
            if (isCol) {
                for (int i = 0; i < R; i++) {
                    matrix[i][0] = 0;
                }
            }


            for(int i=0; i< 3; i++){
                System.out.println();
                for(int j=0; j<3;j++){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }

