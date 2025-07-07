/*

🔢 LeetCode Problem: 54. Spiral Matrix
🌐 Link: https://leetcode.com/problems/spiral-matrix/
📌 Difficulty: Medium
🧠 Topics: Array, Matrix, Simulation

Given an m x n matrix, return all elements of the matrix in spiral order.
Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:
Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 10
-100 <= matrix[i][j] <= 100
  */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result =new ArrayList<>();
        if(matrix==null || matrix.length==0){//------> if its a null matrix of empty matrix then return empty result;
            return result;
        }
        int m=matrix.length;//-------->no.of rows
        int n=matrix[0].length;//-------->no.of Cols
        int top=0,left=0,right=n-1,bottom=m-1;//---------> assigning values according to their positions.
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){//------> copies top row from left to right and increments top.
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){//------> copies right col from top to bottom and decrements right.
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){//------>helps when we have only one row left.
                for(int i=right;i>=left;i--){//------> copies bottom right to left and decrements bottom.
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){// helps when we have only one col left.
                for(int i=bottom;i>=top;i--){//------>Copies left from bottom to top and increments left.
                    result.add(matrix[i][left]);
                }
                left++;
            }  
        }
        return result;//---> finally returning our Spiral Matrix
    }
}
/*Time Complexity :O(n^2)
Space Complexity : O(1) extra space (excluding output list)*/
