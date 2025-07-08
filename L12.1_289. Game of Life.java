/*

🔢 LeetCode Problem: 289. Game of Life
🌐 Link: https://leetcode.com/problems/game-of-life/
📌 Difficulty: Medium
🧠 Topics: Array, Matrix, Simulation.

According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
The next state of the board is determined by applying the above rules simultaneously to every cell in the current state of the m x n grid board. In this process, births and deaths occur simultaneously.

Given the current state of the board, update the board to reflect its next state.

Note that you do not need to return anything.
Example 1:
Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
Example 2:
Input: board = [[1,1],[1,0]]
Output: [[1,1],[1,1]]
 
Constraints:

m == board.length
n == board[i].length
1 <= m, n <= 25
board[i][j] is 0 or 1.
Follow up:

Could you solve it in-place? Remember that the board needs to be updated simultaneously: You cannot update some cells first and then use their updated values to update other cells.
In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches upon the border of the array (i.e., live cells reach the border). How would you address these problems?
  */
class Solution {
    public void gameOfLife(int[][] board) {
        if(board==null || board.length==0){
            return;
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int lives =livingNeighbours(board,board.length,board[0].length,i,j);
                /*
                    00 ---> (dead)(dead)-->0
                    01 ---> (dead)(alive)-->1
                    10 ---> (alive)(dead)-->2
                    11 ---> (alive)(alive)-->3
                */
                if(board[i][j]==1 && lives>=2 && lives<=3){
                    board[i][j]=3;//---> from 1 its becoming 1 again so its 3. 
                }
                else if(board[i][j]==0 && lives==3){
                    board[i][j]=2;//---> from 0 its becoming 1 so its 2
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            board[i][j] >>= 1;  //---> shifting right to get correct values
        }
    }

    }
    public int livingNeighbours(int[][] board,int m,int n,int i,int j){
        int alive =0;
        for(int x=Math.max(i-1,0);x<=Math.min(i+1,m-1);x++){ //------> traverses its neighbours . Math.max()selects max element,Math.min() selects min in both of them so they helps not to go out of bound.
            for(int y=Math.max(j-1,0);y<=Math.min(j+1,n-1);y++){
                alive=alive+(board[x][y]&1); //------> using AND operation as we are changing values to 2 and 3 .
            }
        }
        alive = alive -(board[i][j]&1);//----->subtract self.&using AND operation as we are changing values to 2 and 3 so that they wont affect other value.
        return alive;
    }
}
/* Time Complexity : O(n*m)
livingNeighbours loops are neglected as they wont grow if board size increases . its fixed with 8 values of traversal in max.
Space Complexity : O(1)
*/
