class Solution {
    public static String rsw(String str) {
        int i = 0;
        int n = str.length();
        int j = n - 1;
        char[] str1 = str.toCharArray();
        while (i < j) {
            char temp = str1[i];
            str1[i] = str1[j];
            str1[j] = temp;
            i++;
            j--;
        }

        String ans = new String(str1);
        return ans;
    }

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int k = 0;
        int m = words.length;
        while (k < m) {
            words[k]=rsw(words[k]);
            k++;
        }
         return String.join(" ", words);
    }
}