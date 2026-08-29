class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.split("\\s+");
        int n = word.length;
        String str = word[n-1];
        int ans = str.length();
        return ans;
    }
}