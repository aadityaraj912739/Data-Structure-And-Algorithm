class Solution {
    public static int ascii(char ch){
        int val = (int)ch;
        return val;
    }
    public int scoreOfString(String s) {
        int i = 0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap();
        while(i < n){
            char ch = s.charAt(i);
            int val = ascii(ch);
            if(!map.containsKey(ch)){
                map.put(ch,val);
            }
            i++;
        }
        int j = 0;
        int k = 1;
        int sum = 0;
        while(k < n){
            int cur = Math.abs(map.get(s.charAt(k)) - map.get(s.charAt(j)));
            sum +=cur;
            k++;
            j++;
        }
        return sum;
    }
}