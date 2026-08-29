class Solution {
    public int scoreOfString(String s) {
        int i = 0;
        int j = i+1;
        int n = s.length();
        int sum = 0;
        while(i < n && j < n){
            int firstValue = (int)s.charAt(i);
            int secondValue = (int)s.charAt(j);
            int abs = Math.abs(secondValue - firstValue);
            sum = sum + abs;
            i++;
            j++;
        }
        return sum;
    }
}