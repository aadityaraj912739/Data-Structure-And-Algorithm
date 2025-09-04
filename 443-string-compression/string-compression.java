class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int n = chars.length;
        int j = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while(j < n){
            if(chars[i] == chars[j]){
                while(j < n && chars[i] == chars[j]){
                    count++;
                    j++;
                }
            }
            sb.append(chars[i]);
            if(count > 1){
                sb.append(count);
            }
            count = 0;
            
            i = j;
        }   
        String str = sb.toString();
        for (int k = 0; k < str.length(); k++) {
            chars[k] = str.charAt(k);
        }
        return str.length();
    }
}