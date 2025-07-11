/*
🔢 LeetCode Problem: 57. Insert Interval
🌐 Link: https://leetcode.com/problems/insert-interval/
📌 Difficulty: Medium
🧠 Topics: Array.

You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.

Note that you don't need to modify intervals in-place. You can make a new array and return it.
Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
Example 2:

Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 

Constraints:

0 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 105
intervals is sorted by starti in ascending order.
newInterval.length == 2
0 <= start <= end <= 105
  */
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //--->create new 2d array with 1 step extra.bcz max it can go one step more not more than one.
        int[][] newIntervals = new int[intervals.length + 1][2];
        for (int i = 0; i < intervals.length; i++) {//-------> copy intervals to it.
            newIntervals[i] = intervals[i];
        }
        newIntervals[intervals.length] = newInterval;//------>append newInterval to it.
        
        Arrays.sort(newIntervals,(a,b)->(a[0]-b[0]));//---------->Merge Intervals again.

        List<int[]> result = new ArrayList<>();//------->container for result.

        int start=newIntervals[0][0];
        int end=newIntervals[0][1];
        for(int i=1;i<newIntervals.length;i++){
            int curStart=newIntervals[i][0];
            int curEnd=newIntervals[i][1];
            if(end>=curStart){
                end= Math.max(curEnd,end);
            }
            else{
                result.add(new int[]{start,end});
                start=curStart;
                end=curEnd;
            }
        }
        result.add(new int[]{start,end});//---------->last interval doent have next interval to compare.if it goes to else part it just updates start and end but not adding it to result.So adding it to result.
        return result.toArray(new int[result.size()][]);//--------> output should be in array form so from arraylist change it to array.
    }
}
/*
Time Complexity :O(nlogn)-->bcz of sort.
Space Complexity :O(n)-->bcz of storing result.
*/
