class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int i = 0;
        int n = s1.length();
        while(i < n){
            if(!map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i),1);
            }else{
                map1.put(s1.charAt(i),map1.get(s1.charAt(i))+1);
            }
            i++;
        }
        int j = 0;
        int i1 = 0;
        int m = s2.length();
        while(j < m){
            if(!map2.containsKey(s2.charAt(j))){
                map2.put(s2.charAt(j),1);
            }else{
                map2.put(s2.charAt(j),map2.get(s2.charAt(j))+1);
            }
            if(j - i1 + 1 > n){
                map2.put(s2.charAt(i1),map2.get(s2.charAt(i1))-1);
                if(map2.get(s2.charAt(i1)) == 0){
                    map2.remove(s2.charAt(i1));
                }
                i1++;
            }
            if(j - i1 + 1 == n){
                if(map1.equals(map2)){
                    return true;
                }
            }
            j++;
        }
        return false;
    }
}