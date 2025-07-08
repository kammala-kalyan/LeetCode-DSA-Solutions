/*
🔢 LeetCode Problem: 1. Two Sum
🌐 Link: https://leetcode.com/problems/two-sum/
📌 Difficulty: Easy
🧠 Topics: Array, Hash Table
  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);//-------------------------------->sort array
        int min=0; //--------------------------------------->pointer from beginning.
        int max=nums.length-1;  //--------------------------------------->pointer from end.
        while(min<max){ 
            int sum = nums[min]+nums[max];
            if(sum>target){
                max--;
            }
            else if(sum<target){
                min++;
            }
            else if(sum==target){
                int[] arr={min,max};
                return arr;
            }
        }
        int[] arr={-1,-1}; //-------------------------------------> if target not possible
        return arr;
    }
}
