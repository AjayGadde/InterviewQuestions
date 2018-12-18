package matrix;

public class WordSearch11a {


    public boolean exist(char[][] board, String word){

        int m = board.length;
        int n = board[0].length;

        for(int i=0;i<m; i++){
            for(int j =0; j<n; j++){

            return dfs(board,word,i,j,0);


            }

        }

        return false;


    }


    public boolean dfs(char[][] board, String word, int i, int j, int k){

        int m = board.length;
        int n= board[0].length;

        if(i<0 || j<0 || i>=m || j>=n){
            return  false;
        }

        if(board[i][j] == word.charAt(k)){
            char temp = board[i][j];
            board[i][j]='#';
            if(k==word.length()-1){
                return true;
            } else if (dfs(board, word, i - 1, j, k + 1)
                    || dfs(board, word, i + 1, j, k + 1)
                    || dfs(board, word, i, j - 1, k + 1)
                    || dfs(board, word, i, j + 1, k + 1)
            ) {

                return true;
            }

        }
        return false;

    }
}
