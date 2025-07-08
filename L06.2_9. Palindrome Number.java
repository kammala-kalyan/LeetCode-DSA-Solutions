/*

🔢 LeetCode Problem: 9. Palindrome Number
🌐 Link: https://leetcode.com/problems/palindrome-number/
📌 Difficulty: Easy
🧠 Topics:  Math

Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 */
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }//--------------------------------> if x is negative then its not palindrome.
        int temp=x;//---------------------->duplicating given x to make operations on it.
        int rev=0;//-----------------------> a conatiner to store reversed x
        while(temp!=0){
            rev=(rev*10)+temp%10; 
            temp=temp/10;
        }
        return rev==x;
    }
}
/*
Time Complexity :O(log110 n)
Space Complexity :O(1)
*/
