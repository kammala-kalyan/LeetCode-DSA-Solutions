/*
🔢 LeetCode Problem: 66. Plus One
🌐 Link: https://leetcode.com/problems/plus-one/
 📌 Difficulty: Easy
 🧠 Topics: Array, Math
 
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.
  */
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){//--------------------------->traversing from end of the array.
            if(digits[i] != 9){
                digits[i]+=1;
                return digits;//------------------------------------>if last digit is not equal to 9 then directly add 1 to that digit and return the digits .
            }
            digits[i]=0;//--------------------------------> if last digit is 9 then make it 0 and add 1 to its previous digit.
        }
        digits =new int[digits.length+1];//------------------------> if its a 9999...9 number then foor loop excecutes till beginning and makes 0 and wont return anything. so create an array with +1 size of its digits and make first digit as 1 and return.
        digits[0]=1;
        return digits;
    }
}
/*
Time Complexity : O(n)
Space Complexity : O(1)
  */
