/*
🔢 LeetCode Problem: 125. Valid Palindrome 
🌐 Link: https://leetcode.com/problems/valid-palindrome/
📌 Difficulty: Easy  
🧠 Topics: String , Two Pointers
  
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
  */
class Solution {
    public boolean isPalindrome(String s) {
        // Remove all non-alphanumeric characters using regex
        // [^a-zA-Z0-9] matches anything that is NOT a letter or digit
        s = s.replaceAll("[^a-zA-Z0-9]", "");//------------------------------------>O(n)
        //If the cleaned string is empty, it's considered a valid palindrome
        if (s.isEmpty()) {
            return true;
        }
        // Convert the string to lowercase to make comparison case-insensitive
        s = s.toLowerCase();//------------------------------------>O(n)
        // Initialize two pointers: one at the start, one at the end
        int start = 0, end = s.length() - 1;

        // Loop until the pointers meet in the middle
        while (start < end) { //------------------------------------>O(n/2)=O(n)
            // Compare characters at both ends
            if (s.charAt(start) != s.charAt(end)) {
                // If mismatch, it's not a palindrome
                return false;
            }
            // Move the pointers inward
            start++;
            end--;
        }

        // If all characters matched, it's a palindrome
        return true;
    }
}

/*
Time Complexity : O(n)
Space Complexity :  O(n)
Bcz replaceAll() and toLowerCase() each create new strings, so space is used for the cleaned and lowercased version of the string.
You’re not using any extra arrays or data structures — just primitive variables (start, end), which are O(1).
So total extra space = new string of length ≤ n → O(n)
  */
