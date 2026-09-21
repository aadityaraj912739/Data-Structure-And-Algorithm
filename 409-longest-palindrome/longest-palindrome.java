class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int n = s.length();
        int res = 0;
        int f = 0;
        while(i < n){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                if(map.get(s.charAt(i)) % 2 == 0){
                    res = res + 2;
                }
            }
            i++;
        }
        for (int value : map.values()) {
            if (value % 2 != 0) {
                f++;
            }
        }
        if(f > 0){
            return res+1;
        }
        return res;
    }
}