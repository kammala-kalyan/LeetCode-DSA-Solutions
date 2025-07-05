/* 
🔢 LeetCode Problem: 50. Pow(x, n)
🌐 Link: https://leetcode.com/problems/powx-n/
📌 Difficulty: Medium 
🧠 Topics: Maths, Recurssion
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25

Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
n is an integer.
Either x is not zero or n > 0.
-104 <= xn <= 104
  */
class Solution {
    public double myPow(double x, int n) {
        if(n==0){ //--------------------->anythong power 0 is 1
            return 1;
        }
        if(n<0){//----------------------->if power is negative thden reciprocal base
            x=1/x;
        }
        double sol=1;
        long m=Math.abs((long)n);//----------->take modulus of n. use long to store big numbers
        while(m>=1){//----------------> do until m becomes 1 
            if(m%2==1){//-------------> if power n is odd then multiply it into solution
                sol=sol*x;
            }
            x=x*x;//-----------------> then square of base and reduce power by 2
            m=m/2;
        }
        return sol;//--------------> return solution
    }
}
/*
Time Complexity : O(log n)
Space Complexity : O(1)
*/
