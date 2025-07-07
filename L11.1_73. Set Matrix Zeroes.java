/*
🔢 LeetCode Problem: 73. Set Matrix Zeroes
🌐 Link: https://leetcode.com/problems/set-matrix-zeroes/
📌 Difficulty: Medium
🧠 Topics: Array, Hashtable, Matrix 

 Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 
Constraints:

m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
  */
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;//-------> no.of rows
        int n=matrix[0].length;//-------> no.of columns
        boolean firstRow=false;//-------------> initially consider that firstRow and firstCol has no zeros.
        boolean firstCol=false;

        for(int i=0;i<n;i++){ //----------> check if first row has any zero (here n column changes row remains same)if yes mark it as true.
            if(matrix[0][i]==0){
                firstRow=true;
                break;
            }
        }
        for(int i=0;i<m;i++){//----------> check if first Col has any zero (here m row changes column remains same)if yes mark it as true.
            if(matrix[i][0]==0){
                firstCol=true;
                break;
            }
        }
        //--------------> traverse each and every element except first row and first column if any element is 0 then make its firstRow,firstCol as 0.
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<m;i++){//-----------> Now any element which has its firstRow or firstCol as zero then make it as 0;
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                   matrix[i][j]=0;
                }
            }
        }
        if(firstRow){//-----> if firstRow was having zero before making any changes then make first row elements as 0;
            for(int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }
        if(firstCol){//-----> if firstCol was having zero before making any changes then make first col elements as 0;
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}
/* Time Complexity : O(n^2)
Space Complexity :O(1)
*/
