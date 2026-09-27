class Solution {
    public boolean isValidSudoku(char[][] board) {
        int block[][] = {{0,2},{3,5},{6,8}};
        for(int i = 0; i<board.length;i++){
            System.out.println("row : "+ Arrays.toString(board[i]));
            if(checkRowOrCol(board[i]) == false) return false;
        }
        
        for(int row = 0; row<board.length;row++){
            char[] col = new char[board.length];
            int colIndex = 0;
            for(int j = 0; j<board.length;j++){
                    col[colIndex++] = board[j][row];
            }
            System.out.println("col : "+ Arrays.toString(col));
            if(checkRowOrCol(col) == false) return false;
            colIndex++;
        }
       for(int rowBlock = 0;rowBlock<block.length;rowBlock++){
            
            for(int colBlock = 0;colBlock<block.length;colBlock++){
                char[] arr = new char[9];
                int count = 0;
                    for(int i = block[rowBlock][0];i<=block[rowBlock][1];i++){
                        for(int j = block[colBlock][0];j<=block[colBlock][1]&& count<9;j++){
                            arr[count] = board[i][j];
                            count = count +1;
                        }
                    }
                if(checkRowOrCol(arr) == false) return false;
            }
            
        }       
        
        
        
        return true;
    }

    public boolean checkRowOrCol(char[] row){
        int[] baseline = new int[row.length+1];
        Arrays.fill(baseline,0);
        for(int i =0;i<row.length;i++){
            if(row[i] == '.'){
                continue;
            }else{
                if(baseline[row[i] - '0'] == 1) return false;
                baseline[row[i] - '0'] = 1;
            }
        }
        return true;
    }
}
