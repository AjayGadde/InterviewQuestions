package matrix;

public class SearchMatrix3b {


    public static void main(String[] args) {
        SearchMatrix3b searchMatrix3b = new SearchMatrix3b();

        int[][] matrix =  { {10, 20, 30, 40},
                             {15, 25, 35, 45},
                             {27, 29, 37, 48},
                                {32, 33, 39, 50}};

        searchMatrix3b.searchMatrix(matrix,37);
    }

    public boolean searchMatrix(int[][] matrix, int target){
        int m = matrix.length-1;
        int n = matrix[0].length-1;

        int i=m;
        int j=0;

        while(i>=0 && j<=n){
            if(target < matrix[i][j]){
                i--;
            }else if(target > matrix[i][j]){
                j++;
            }else {
                return true;
            }

        }
        return false;

    }

}
