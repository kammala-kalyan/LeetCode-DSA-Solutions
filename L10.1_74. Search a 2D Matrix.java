/*
🔢 LeetCode Problem: 74. Search a 2D Matrix
🌐 Link: https://leetcode.com/problems/search-a-2d-matrix/
📌 Difficulty: Medium
🧠 Topics: Array, Binary Search, Matrix 

You are given an m x n integer matrix matrix with the following two properties:
Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.
Example 1:

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
  */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0, end = m * n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;//-----------> mid index in 1d array of given 2d
            int row = mid / n;//-------->finding row position of mid from 1d to 2d
            int col = mid % n;//-------->finding column position of mid from 1d to 2d
            int value = matrix[row][col];//---------->accessing mid value.
//-----------> Comparing same as binary Search
            if (value == target){
                return true;
            }
            else if(value < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}
/* Time Complexity : O(log n)
Space Complexity : O(1)
*/
