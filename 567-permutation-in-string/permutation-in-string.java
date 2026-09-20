class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>map1 = new HashMap<>();
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
        int k = 0;
        int j = 0;
        int m = s2.length();
        if(n > m){
            return false;
        }
        HashMap<Character,Integer>map2 = new HashMap<>();
        while(k < m && j < m){
            if(!map2.containsKey(s2.charAt(j))){
                map2.put(s2.charAt(j),1);
            }else{
                map2.put(s2.charAt(j),map2.get(s2.charAt(j))+1);
            }
            if(j - k + 1 > n){
                if(map2.get(s2.charAt(k)) > 1){
                    map2.put(s2.charAt(k),map2.get(s2.charAt(k))-1);
                }else{
                    map2.remove(s2.charAt(k));
                }
                k++;
            }
            if(n == j - k + 1){
                if(map2.equals(map1)){
                    return true;
                }
            }
            j++;
        }
        return false;
    }
}