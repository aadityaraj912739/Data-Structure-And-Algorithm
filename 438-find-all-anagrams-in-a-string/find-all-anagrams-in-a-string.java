class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int i = 0;
        int n = p.length();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();
        while(i < n){
            if(!map.containsKey(p.charAt(i))){
                map.put(p.charAt(i),1);
            }else{
                map.put(p.charAt(i),map.get(p.charAt(i))+1);
            }
            i++;
        }

        int j = 0;
        int i1 = 0;
        int m = s.length();
        while(j < m ){
            if(!map1.containsKey(s.charAt(j))){
                map1.put(s.charAt(j),1);
            }else{
                map1.put(s.charAt(j),map1.get(s.charAt(j))+1);
            }
            if(j-i1+1 > n){
                map1.put(s.charAt(i1),map1.get(s.charAt(i1))-1);
                if(map1.get(s.charAt(i1)) == 0){
                    map1.remove(s.charAt(i1));
                }
                i1++;
            }

            if(j-i1+1 == n){
                if(map.equals(map1)){
                    list.add(i1);
                }
            }
            j++;
        }
        return list;
    }
}