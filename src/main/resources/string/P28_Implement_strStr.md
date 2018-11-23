##Implement strStr()

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

**Example 1:**

```
Input: haystack = "hello", needle = "ll"
Output: 2
```

**Example 2:**

```
Input: haystack = "aaaaa", needle = "bba"
Output: -1
```

**Clarification:**

What should we return when `needle` is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when `needle` is an empty string. This is consistent to C's strstr() and Java's indexOf().


** Hint **

Main Takeaway of this Algorithm: Do not compute what has already been calculated. Hence increase efficiency


** prefix function **

The prefix function for a pattern encapsulates knowledge about how the pattern matches againse shifts of itself. (This enables avoiding backtracking on the string 'S').

Values in prefix array are lengths of longest prefix of P which is a proper suffix of P[k].

** KMP Matcher **

With string 'S', pattern 'p' and prefix function as inputs, finds the occurrence of 'p' in 'S' and returns the number of shifts of 'p' after which occurrnce is found.