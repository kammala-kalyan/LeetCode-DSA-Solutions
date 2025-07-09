/*
🔢 LeetCode Problem: 169. Majority Element
🌐 Link: https://leetcode.com/problems/majority-element/
📌 Difficulty: Easy
🧠 Topics: Array, Hash Table, Divide and Conquer, Sorting, Counting

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
  */
//----> Approach-1 (Time exceeded)
class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++){//--->traverse each element and count its count.
            int count=0;//---->initially count will be 0.
            for(int j=0;j<nums.length;j++){//----> from beginning of the array we will check how many times its repeated.if repeated more than n/2 times then return that number.
                if(nums[i]==nums[j]){
                    count++;
                }
                if(count>nums.length/2){
                    return nums[i];
                }
            }
        }
        return -1;//----> if no element is found then -1.
    }
}
// Time Complexity : O(n^2) and Space Complexity : O(1)
//-------->Approach-2 : Optimal
class Solution {
    public int majorityElement(int[] nums) {
        int element=0;//-----> initializing element because we are using element for comparision in if else ladder.
        int count=0;
        for(int i=0;i<nums.length;i++){//------> Boyer-Moore's Algorithm.
            if(count==0){
                element=nums[i];
                count=1;
            }
            else if(nums[i] == element){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
        //----> since majority element exists in array not checking if exist or not.
    }
}
/*Time Complexity :O(n)
Space Complexity :O(1)
*/
