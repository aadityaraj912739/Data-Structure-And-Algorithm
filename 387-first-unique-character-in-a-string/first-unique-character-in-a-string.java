class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int i = 0;
        while(i < n ){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            i++;
        }

        int j = 0;
        while(j < n){
            if(map.get(s.charAt(j)) == 1){
                return j;
            }
            j++;
        }

        return -1;
    }
}