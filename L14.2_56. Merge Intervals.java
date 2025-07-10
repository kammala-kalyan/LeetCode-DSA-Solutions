/*
🔢 LeetCode Problem: 56. Merge Intervals
🌐 Link: https://leetcode.com/problems/remove-element/
📌 Difficulty: Medium
🧠 Topics: Array, Sorting
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
  */
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int start=intervals[0][0];
        int end =intervals[0][1];
        for(int i=0;i<intervals.length;i++){
            int curstart=intervals[i][0];
            int curend=intervals[i][1];
            if(curstart<=end){
                end=Math.max(end,curend);
            }
            else{
                int[] newinterval ={start,end};
                result.add(newinterval);
                start=curstart;
                end=curend;
            }
        }
        result.add(new int[]{start,end});
        
        return result.toArray(new int[result.size()][]);
    }
}
