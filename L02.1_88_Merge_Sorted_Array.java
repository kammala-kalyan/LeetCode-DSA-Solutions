/*
🔢 LeetCode Problem: 88. Merge Sorted Array
🌐 Link: https://leetcode.com/problems/merge-sorted-array/description/
📌 Difficulty: Easy  
🧠 Topics: Array, Two Pointers ,Sorting
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
  */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) { // input of 2 arrays with their size m and n
        int[] nums3 = nums1.clone(); // cloning nums1 as nums3 to use nums1 to store merge ,sorted array.
        int i=0,j=0,k=0;// i index for nums3,j index for nums2 and k is index for nums1.
        while(i<m && j<n){  //--------------------> O(m) or O(n)
          // goes until the length of the shortest array in nums3 and muns2. 
            if(nums3[i]<=nums2[j]){
                nums1[k]=nums3[i]; // if nums3 is having min value then add it to nums1 and increment i and k as they are indecies of nums1 and nums3
                i++;
                k++;
            }
            else {
                nums1[k]=nums2[j]; // if nums2 is having min value then add it to nums1 and increment j and k as they are indecies of nums1 and nums2
                j++;
                k++;
            }
        }
      // after above operation one array would be left and one array is merged . so we will merge the 2nd array completely.
        while(i<m){ //---------------------------------> O(m)-----if above loop has O(n)  the this will activate
            nums1[k]=nums3[i]; //if its nums3 array then this loop activates.
            i++;
            k++;
        }
        while(j<n){ //---------------------------------> O(n)-----if above loop has O(m)  the this will activate
            nums1[k]=nums2[j]; ////if its nums2 array then this loop activates.
            j++;
            k++;
        }
    }
}
/* 
Time Complexity : O(m+n)
Space Complexity : O(m) as we clone nums1.

*/
