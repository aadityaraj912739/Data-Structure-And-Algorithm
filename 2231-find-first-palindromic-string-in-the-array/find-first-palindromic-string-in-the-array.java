class Solution {
    public static boolean pal(String str){
        int n = str.length();
        int i = 0;
        int j = n-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int i = 0;
        int n = words.length;
        while(i < n){
            String ans = words[i];
            if(pal(ans)){
                return words[i];
            }
            i++;
        }
        return "";
    }
}