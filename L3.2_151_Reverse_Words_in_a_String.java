/*
🔢 LeetCode Problem: 151. Reverse Words in a String
🌐 Link: https://leetcode.com/problems/reverse-words-in-a-string/
📌 Difficulty: Medium  
🧠 Topics: Two Pointers, String
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Constraints:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
 

Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
  */
// In java Strings are immutable.
// Using Char Array
class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");//------------------------------------>remove leading,triling spaces and extra empty spaces in btwn words.
        char[] arr = s.toCharArray();//-------------------------------------------->Convert string into array.
        reverse(arr,0,arr.length-1);//--------------------------------------------->reverse entire array.
        int min=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){//---------------->reverse the reversed char to get correct word.so reverse each word.each word means min will be the starting of the word and max is the index of word ending.
                max=i-1; 
                reverse(arr,min,max);
                min=i+1;
            }
        }
        reverse(arr,min,arr.length-1);//-----------------------> for last word we dont have any space so, reverse final word.
        String s1= new String(arr);//---------------------------> convert the char array back to string again and return it.
        return s1;
    }
    public void reverse(char[] arr,int start,int end){ //-------------------------->reverse function.
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
/*
Time Complexity : O(n)----------------> single level for loop and single level while loop
Time Complexity : O(n)----------------> because of char[] (needed due to Java strings being immutable)
*/
/* | Code                               | Description                                                             |
| ---------------------------------- | ----------------------------------------------------------------------- |
| `s.replaceAll("^\\s+", "")`        | Remove **leading** whitespace                                           |
| `s.replaceAll("\\s+$", "")`        | Remove **trailing** whitespace                                          |
| `s.trim()`                         | Removes both **leading and trailing** whitespace (simpler alternative!) |
| `s.replaceAll("\\s+", " ")`        | Replace **all whitespace (anywhere)** with a single space               |
| `s.replaceAll("[^a-zA-Z0-9]", "")` | Remove **all non-alphanumeric characters**                              |
| `s.replaceAll("\\d", "")`          | Remove all **digits**                                                   |
| `s.replaceAll(" +", " ")`          | Replace **multiple spaces** with **a single space**                     |

s.replaceAll(" +", " ")
Matches: One or more space characters only (' ')

Ignores: Tabs (\t), newlines (\n), carriage returns (\r), etc.

✅ Example:

String s = "Hello    World\t\tJava";
System.out.println(s.replaceAll(" +", " "));
// Output: "Hello World		Java" ← tabs are not touched

s.replaceAll("\\s+", " ")
Matches: One or more whitespace characters, including:

Regular space (' ')

Tab (\t)

Newline (\n)

Carriage return (\r)

Form feed (\f)

✅ Example:

String s = "Hello    World\t\tJava\nis\tcool";
System.out.println(s.replaceAll("\\s+", " "));
// Output: "Hello World Java is cool" ← all whitespace normalized
*/
