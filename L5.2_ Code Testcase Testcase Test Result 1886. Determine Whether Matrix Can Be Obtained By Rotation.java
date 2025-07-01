/*

🔢 LeetCode Problem: 1886. Determine Whether Matrix Can Be Obtained By Rotation

🌐 Link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

 📌 Difficulty: Easy

 🧠 Topics: Array,Matrix
 

Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
Example 1:


Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
Example 2:


Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.
Example 3:


Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
 

Constraints:

n == mat.length == target.length
n == mat[i].length == target[i].length
1 <= n <= 10
mat[i][j] and target[i][j] are either 0 or 1.
*/
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int r=0;r<4;r++){
            if(issame(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
    public boolean issame(int[][] mat, int[][] target){
        int n=mat.length;
        int m=target.length;
        if(n!=m){
            return false;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(target[i][j]!=mat[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        transpose(matrix);
        for(int i=0;i<n;i++){
            reverseRow(matrix[i]);
        }
    }
    public void transpose(int[][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public void reverseRow(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
