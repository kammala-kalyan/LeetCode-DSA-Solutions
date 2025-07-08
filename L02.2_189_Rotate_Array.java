/*
🔢 LeetCode Problem: 189. Rotate Array
🌐 Link: https://leetcode.com/problems/rotate-array/
📌 Difficulty: Medium  
🧠 Topics: Array, Two Pointers , Math
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 
*/// Approach -1
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length; // to get k value withinin 0 and length of nums and be in bound of array length
        int newArr[]=new int[nums.length]; // creating new array with same size of nums
        int j=0; 
        for(int i=nums.length-k;i<nums.length;i++){ //--------------------------->O(k)
          // copying from the no.of rotations needed to new array
            newArr[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length-k;i++){ // copying the rest //------------------------>O(k-nums.length)
            newArr[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length;i++){ //------------------------------------>O(nums.length)
            nums[i]=newArr[i]; // overwriting rotatated array into nums
        }
    }
} 
/*
Time Complexity : O(nums.length)
Space Complexity : O(nums.length)
*/
// Approach-2 
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;  // to get k value withinin 0 and length of nums and be in bound of array length
        reverse(nums,0,nums.length-1); // reverse entire array
        reverse(nums,0,k-1); // reverse first kth part 
        reverse(nums,k,nums.length-1); // reverse next part to get rotation of array 
    }
    public void reverse(int[]nums,int start,int end){
        while(start<end){ //------------------------------------> reversing function of an array
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
  /*
Time Complexity : O(nums.length)
Space Complexity : O(1)---------> no external space required.
*/
