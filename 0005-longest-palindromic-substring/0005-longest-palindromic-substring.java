class Solution {
    // A method for "expanding" from the center and finding the length of a palindrome
    public int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--; // going left
            right++; // go to the right
        }
// Returning the length of the palindrome
        return right - left - 1;
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return ""; // checking for an empty string

        int start = 0, end = 0; // start and end of the longest palindrome

        for (int i = 0; i < s.length(); i++) {
// Checking an odd-length palindrome (for example, "bab")
            int len1 = expand(s, i, i);
            // Checking an even-length palindrome (for example, "abba")
int len2 = expand(s, i, i + 1);

            // Choosing the maximum length
            int maxLen = Math.max(len1, len2);

            // If you find a palindrome longer than the previous one
            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2; // updating the start
                end = i + maxLen / 2; // updating the end
            }
}
// Returning the substring from start to end
        return s.substring(start, end + 1);
    }
}