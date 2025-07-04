/* 
🔢 LeetCode Problem: 69. Sqrt(x)
🌐 Link: https://leetcode.com/problems/sqrtx/
📌 Difficulty: Easy  
🧠 Topics: Maths, Binary Search 

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1
  */
class Solution {
    public int mySqrt(int x) {
        if(x<2){ //----------------------> if x is less than 2 return x
            return  x;
        }
        int start=1;//-------------------> initialize start with 1,end with x and ans as 0.
        int end=x;
        int ans=0;
        while(start<=end){
            int mid= start + (end-start)/2;//--------->calculate mid.
            long square = (long) mid*mid; 
            if(square==x){//------------> if square of mid is equal to x then return mid.
                return mid;
            }
            else if(square>x){//------------> if square of mid is greater than to x then change its end to mid-1.
                end=mid-1;
            }
            else{
                ans=mid;
                start=mid+1;//------------> if square of mid is less than to x then change its start to mid+1 and answer is mid.
            }
        }
        return ans;
    }
}
/* Time Complexity : O(log n)
Space Complexity :O(1)
*/
