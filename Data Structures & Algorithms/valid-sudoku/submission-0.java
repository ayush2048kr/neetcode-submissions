class Solution {
    public boolean isValidSudoku(char[][] board) {
       java.util.HashSet<Character>[] rows=new java.util.HashSet[9];
       java.util.HashSet<Character>[] cols=new java.util.HashSet[9];
       java.util.HashSet<Character>[] boxes=new java.util.HashSet[9];
       for(int i=0;i<9;i++)
       {
        rows[i]=new java.util.HashSet<>();
        cols[i]=new java.util.HashSet<>();
        boxes[i]=new java.util.HashSet<>();
       }
       for (int r=0;r<9;r++)
       {
        for (int c=0;c<9;c++)
        {
            char num=board[r][c];
            if(num=='.')
            {
                continue;
            }
            int boxIndex=(r/3)* 3 + (c / 3);
                if (rows[r].contains(num) ||
                    cols[c].contains(num) ||
                    boxes[boxIndex].contains(num)) {

                    return false;
                }

                rows[r].add(num);
                cols[c].add(num);
                boxes[boxIndex].add(num);
            }
        }

        return true;
                  }
       }
