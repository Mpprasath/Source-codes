class Solution {
    public int fn(int[][] board,int i,int j){
         if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]==0) return 0;
         return 1;
    }
    public void gameOfLife(int[][] board) {
        int m=board.length,n=board[0].length;
        int temp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int neighbourcheck=fn(board,i,j+1)+fn(board,i,j-1)+fn(board,i-1,j)+fn(board,i+1,j)  +fn(board,i-1,j+1)+fn(board,i+1,j+1)+fn(board,i+1,j-1)+fn(board,i-1,j-1);
                if(board[i][j]==1){
                    temp[i][j]=(neighbourcheck<2||neighbourcheck>3)?0:1;
                }else{
                    temp[i][j]=(neighbourcheck==3)?1:0;
                }
            }
        }
        for(int i=0;i<m;i++){
            board[i]=temp[i].clone();
        }
    }
}
