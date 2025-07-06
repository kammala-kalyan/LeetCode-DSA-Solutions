/*
🔢 LeetCode Problem: 240. Search a 2D Matrix II
🌐 Link: https://leetcode.com/problems/search-a-2d-matrix-ii/description/
📌 Difficulty: Medium
🧠 Topics: Array, Binary Search, Matrix, Divide and Conquere

Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

Example 1:
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
Output: true
Example 2:
Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
Output: false
Constraints:

m == matrix.length
n == matrix[i].length
1 <= n, m <= 300
-109 <= matrix[i][j] <= 109
All the integers in each row are sorted in ascending order.
All the integers in each column are sorted in ascending order.
-109 <= target <= 109
*/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =0, col=matrix.length-1;//-------->taking 1st row last column as intial position
        while(row<=matrix[0].length-1 && col>=0){//-----> go until last row and 1st column.
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){//-----> if element in that position is greater than target then its col has increasing order so target wont be there so neglect that column.
                col--;
            }
            else{//-----> if element in that position is less than target then its row has increasing order so target wont be there so neglect that row.
                row++;
            }
        }
        return false;
    }
}
/*
Time Complexity : O(n+m)
Space Complexity :O(1)
*/
