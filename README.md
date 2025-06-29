<h1 align="center"><strong> Leet-Code DSA Solutions</strong></h1>

---
---
# 📚 LeetCode Daily Practice – by Kammala Kalyan

Hey! 👋
This is where I’m uploading all the LeetCode problems I solve every day. I'm currently focusing on improving my problem-solving skills, especially in Java, and using this repo to keep track of my consistency and progress.

# 📌 Why I Made This Repo:
-- To build a habit of solving problems daily 🧠.

-- To revise and organize all my solved problems in one place 📂.

-- To create a small portfolio I can share on LinkedIn and during interviews 💼.



# 💻 What's Inside:
-- My Java solutions to LeetCode problems.

-- Proper filenames with problem numbers and titles.

-- Short comments or explanations (I try to keep them simple).

-- Time and space complexity.


# 📘 Day 1 – Arrays & Two-Pointer Technique

🗓️ Date: 27 June 2025

🎯 Focus Areas: Arrays, Two-Pointer Technique


# ✅ Problems Solved:

27. Remove Element.

26. Remove Duplicates from Sorted Array.

80. Remove Duplicates from Sorted Array II.

# 🧠 What I Learned:

How to remove elements or duplicates in-place using two pointers.

Importance of handling array bounds and updating the correct index.

Learned to rethink my logic when stuck, instead of rushing to a solution.

Got better at writing cleaner code and understanding how k (the write pointer) should behave.


# 🛠️ Techniques Practiced:

Two-pointer approach (i for reading, k for writing).

In-place array modifications.

Dealing with conditions like nums[i] != nums[k-2] to limit repetitions.

# 💬 Reflection:

I felt stuck a couple of times, especially when checking conditions for duplicates in Problem 80. Instead of copying the solution, I took a short break, walked through test cases on paper, and restructured my approach. This made the logic clearer and gave me more confidence.

Looking forward to building on this tomorrow. ✌️


# 📘 Day 2 – Array Manipulation & String Handling

🗓️ Date: 28 June 2025

🎯 Focus Areas:

Array manipulation (merging and rotating), string preprocessing, two-pointer string traversal.

# ✅ Problems Solved:

88. Merge Sorted Array

189. Rotate Array

125. Valid Palindrome


# 🧠 What I Learned:

-- How to merge two sorted arrays in-place using extra space and optimized pointer logic.

-- Realized the benefit of merging from the back to avoid overwriting elements.

-- Learned multiple techniques for rotating arrays: brute-force, extra array, and optimal reverse approach using 3-step reversal.

-- Improved regex and string handling in Java for filtering characters.

-- Understood the importance of charAt() and how strings are different from arrays in Java.

-- Practiced writing a clean palindrome checker using alphanumeric filtering and case normalization.


# 🛠️ Techniques Practiced:

-- Two-pointer technique for merging and comparing.

-- Reverse-based rotation using three-part reversal.

-- Regex for string cleanup ([^a-zA-Z0-9]).

-- Case-insensitive character comparison using toLowerCase() and charAt().


# 💬 Reflection:

-- Today’s problems helped me level up my skills in both array manipulation and string processing. I made some small syntax mistakes early on (like s.charAt[index] and isempty()), but identifying and fixing them myself gave me more confidence.

-- Rotating an array using the three-step reverse was a cool technique — clean and efficient!

-- Also, debugging string logic with test cases like "0P" in the Valid Palindrome problem taught me to pay attention to constraints and edge cases.

-- Ready to dive into Day 3 — hopefully with some more challenging problems! 🚀


---

# 📘 Day 3 – Strings & Two-Pointer Logic

🗓️ **Date**: 29 June 2025

🎯 **Focus Areas**:

* String manipulation (trimming, reversing, and splitting)
* Two-pointer search in sorted arrays

---

## ✅ Problems Solved:

* 58. **Length of Last Word**
* 151. **Reverse Words in a String**
* 167. **Two Sum II – Input Array Is Sorted**

---

## 🧠 What I Learned:

* ✅ In **Length of Last Word**, learned how to trim whitespace and backtrack from the end efficiently.
* ✅ In **Reverse Words in a String**, practiced an in-place reversal technique by:

  * Trimming and collapsing extra spaces with `.trim().replaceAll("\\s+", " ")`
  * Reversing the entire string using a character array
  * Then reversing each individual word to restore proper word order
* ✅ From **Two Sum II**, used the two-pointer technique to find target pairs in a sorted array in `O(n)` time.

---

## 🛠️ Techniques Practiced:

* `trim()`, `replaceAll()`, and manual character array reversal for precise control over string formatting.
* Two-pointer traversal (`min` and `max`) to isolate and reverse each word efficiently.
* `while (start < end)` logic for custom reverse methods.
* Efficient scanning using `left` and `right` pointers to find pairs with a target sum.

---

## 💬 Reflection:

* Today’s string-based problems helped me explore both built-in methods and manual control techniques — a great balance!
* Writing a full reverseWords function from scratch was both challenging and rewarding. It gave me clarity on when to convert strings to `char[]`, especially for in-place editing.
* The Two Sum II logic solidified my understanding of leveraging constraints like “sorted input” to reduce time complexity.

✨ Excited for Day 4 — planning to explore **sliding window** or **hash-based** problems next!

---
