# LeetCode Problem Solve


# String

## Problem 1 : [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)</br>

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.</br>

Note: For the purpose of this problem, we define empty string as valid palindrome.</br>

Example 1:</br>

	Input: "A man, a plan, a canal: Panama"</br>
	Output: true</br>

## Problem 2 : [344. Reverse String](https://leetcode.com/problems/reverse-string/)</br>
Write a function that reverses a string. The input string is given as an array of characters char[].</br>

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.</br>

You may assume all the characters consist of printable ascii characters.</br>

Example 1:</br>

	Input: ["h","e","l","l","o"]</br>
	Output: ["o","l","l","e","h"]</br>

## Problem 3 : [151. Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)</br>

Given an input string, reverse the string word by word.</br>

Example 1:</br>

	Input: "the sky is blue"</br>
	Output: "blue is sky the"</br>
### [Solution :](https://zichenwang.gitbooks.io/algorithms-summary/151-reverse-words-in-a-string.html)</br>

## Problem 4 : [345. Reverse Vowels of a String (Easy)](https://leetcode.com/problems/reverse-vowels-of-a-string/)

Write a function that takes a string as input and reverse only the vowels of a string.</br>

Example 1:</br>

	Input: "hello"</br>
	Output: "holle"</br>
Example 2:</br>

	Input: "leetcode"</br>
	Output: "leotcede"</br>
Note:</br>
The vowels does not include the letter "y</br>
### [Solution](https://codedestine.com/reverse-vowels-of-string/)


## Problem 5: [383. Ransom Note (Easy)]

Given an arbitrary ransom note string and another string containing letters from all the magazines, </br>
write a function that will return true if the ransom note can be constructed from the magazines ; </br>
otherwise, it will return false.</br>

Each letter in the magazine string can only be used once in your ransom note.</br>

Note:</br>
You may assume that both strings contain only lowercase letters.</br>

canConstruct("a", "b") -> false</br>
canConstruct("aa", "ab") -> false</br>
canConstruct("aa", "aab") -> true</br>
