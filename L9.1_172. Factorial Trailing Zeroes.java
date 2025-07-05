/*

🔢 LeetCode Problem: 172. Factorial Trailing Zeroes
🌐 Link: https://leetcode.com/problems/factorial-trailing-zeroes/solutions/6272730/3-lines-super-simple-solution-beats-c-java-python-javascript/?envType=study-plan-v2&envId=top-interview-150
📌 Difficulty: Medium
🧠 Topics: Math 
Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

Example 1:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.
Example 2:

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.
Example 3:

Input: n = 0
Output: 0
 

Constraints:

0 <= n <= 104
 */
class Solution {
    public int trailingZeroes(int n) {
        int result=0;
        /*------->for finding factorial tariling zeros we have a pattern. 
        0-4--->no zeros.
        5-9--->1 zero
        10-14->2 zeroes
        15-19->3 zeros.......
        no. of zeros increase with multiple of 5.so no.of times 5 can be divisible with n it has that many leading zeros.
*/
        while(n>0){
            n=n/5;
            result=result+n;
        }
        return result;
    }
}

/* Time Complexity : O(log5 n)
  Space Complexity :O(1)
  */
