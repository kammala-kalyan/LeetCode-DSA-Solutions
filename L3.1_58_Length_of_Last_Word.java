/*
🔢 LeetCode Problem: 58. Length of Last Word
🌐 Link: https://leetcode.com/problems/length-of-last-word/
📌 Difficulty: Easy  
🧠 Topics: String
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
  */

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.replaceAll("\\s+$","");//----------------------------->removes spaces at the end.
        int count=0;
        for(int i=s.length()-1;i>=0;i--){ //------------------------>travesing from end of the string.
            if(s.charAt(i) != ' '){
                count++;
            }
            else{
                return count;
            }
            
        }
        return count;
    }
}
//or
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();//----------------------------->removes spaces at the end and beginning.
        int count=0;
        for(int i=s.length()-1;i>=0;i--){ //------------------------>travesing from end of the string.
            if(s.charAt(i) != ' '){
                count++;
            }
            else{
                return count;
            }
            
        }
        return count;
    }
}
/*
Time complexity : O(n) 
Space Complexity : O(1)
count is a single integer variable .So,It does not grow with the size of the input string.
*/
/* When I used s = s.replaceAll("\\s+$","");, I got 2ms of runtime, but when I used s = s.trim();, 
I got 0ms of runtime because s.trim() is a built-in function in Java, which is already optimized internally. 
It directly removes spaces from both ends without using regex, so it works faster. 
But replaceAll() uses a regular expression, which takes extra time to process the pattern, so it's a bit slower.
  */
