class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        Arrays.fill(arr, -1);
        int ans = 0, i = 0;
        for (int j = 0; j < s.length(); j++) {
            int idx = (int)(s.charAt(j));
            if (arr[idx] == -1 || arr[idx] < i) {
                arr[idx] = j;
            }else{
                i = arr[idx]+1;
                arr[idx] = j;
            }
            ans = Math.max(ans, j-i+1);
        }
        return ans;
    }
}