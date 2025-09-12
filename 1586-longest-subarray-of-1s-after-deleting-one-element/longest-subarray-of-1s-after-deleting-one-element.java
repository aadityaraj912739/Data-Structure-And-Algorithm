class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, j = 0;
        int n = nums.length;
        int zeroCount = 0;
        int maxLen = 0;

        while (j < n) {
            if (nums[j] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;
            }
            maxLen = Math.max(maxLen, j - i);
            j++;
        }

        return maxLen;
    }
}
