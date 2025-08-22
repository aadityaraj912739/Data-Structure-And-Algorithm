class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();
        int j = 0;
        while(i < n){
            char ch = s.charAt(i);
            
            if( j < spaces.length   && i == spaces[j] ){
                sb.append(" ");
                j++;
            }
            sb.append(ch);
            i++;
        }
        return sb.toString();
    }
}