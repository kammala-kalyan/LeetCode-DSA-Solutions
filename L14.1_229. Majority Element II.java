/*
🔢 LeetCode Problem: 229. Majority Element II
🌐 Link: https://leetcode.com/problems/majority-element-ii/
📌 Difficulty: Medium
🧠 Topics: Array, Hash Table, Sorting, Counting
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
Example 1:
Input: nums = [3,2,3]
Output: [3]
Example 2:
Input: nums = [1]
Output: [1]
Example 3:
Input: nums = [1,2]
Output: [1,2]

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
Follow up: Could you solve the problem in linear time and in O(1) space?
  */
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();//-------->result container to store result.
        if(nums == null || nums.length==0){ //------------> checking base case.
            return result;
        }
        int element1=0,element2=0;
        int count1=0,count2=0;//---------------> in a array of size n we atmost have 2 majority elements with n/3 times.
        for(int i=0;i<nums.length;i++){//--> using booyer moore algorithm.
            if(element1==nums[i]){ //------>if element 1 is nums[i] then increment its count.
                count1++;
            }
            else if(element2 == nums[i]){ //------>if element 2 is nums[i] then increment its count.
                count2++;
            }
            else if(count1==0){//------>if count1 is 0 then assign the current element to lement1 and make its count as 1.
                element1=nums[i];
                count1=1;
            }
            else if(count2==0){//------>if count2 is 0 then assign the current element to lement1 and make its count as 1.
                element2=nums[i];
                count2=1;
            }
            else if(element1!=nums[i] && element2!=nums[i]){//------>if current element is not equal to element1 and 2 then decrement both of them.
                count1--;
                count2--;
            }
        }//-------> Now we got 2 elements which are at majority. wee need to check if they are in count greater than n/3.
        int count3=0;
        for(int i=0;i<nums.length;i++){
            if(element1==nums[i]){
                count3++;
            }
        }
        if(count3 > nums.length/3){
            result.add(element1);
        }
        int count4=0;
        for(int i=0;i<nums.length;i++){
            if(element2==nums[i]){
                count4++;
            }
        }
        if(count4 > nums.length/3 && element1!=element2){ //------> using element1!=element2 to avoid duplicates.
            result.add(element2);
        }
        
        return result;
    }
}
// Time Complexity = O(n) 
// Space Complexity :O(1)
