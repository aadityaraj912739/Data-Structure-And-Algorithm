class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int i = 0;
        int n = s.length();
        int j = 0;
        int m = t.length();
        while(i < n){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),1);
            }else{
                map1.put(s.charAt(i),map1.get(s.charAt(i)) + 1);
            }
            i++;
        }
        while(j < m){
            if(!map2.containsKey(t.charAt(j))){
                map2.put(t.charAt(j),1);
            }else{
                map2.put(t.charAt(j), map2.get(t.charAt(j))+1);
            }
            j++;
        }

        if(map1.equals(map2)){
            return true;
        }else{
            return false;
        }
    }
}