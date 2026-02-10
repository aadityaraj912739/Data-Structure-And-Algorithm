class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int n = s.length();
        int j = 0;
        int count = 0;
        int max = 0;
        while(j < n){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),1);
            }else{
                map.put(s.charAt(j),map.get(s.charAt(j))+1);
            }
            if(j - i + 1 > 3){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i)) == 0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            if(j - i + 1 == 3 && map.size() == 3){
                count++;
            }
            j++;
        }
        return count;
    }
}