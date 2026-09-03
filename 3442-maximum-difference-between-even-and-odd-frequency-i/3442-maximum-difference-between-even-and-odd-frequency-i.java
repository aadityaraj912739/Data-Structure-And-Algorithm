class Solution {
    public int maxDifference(String s) {
        int i = 0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        while(i < n){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            i++;
        }
        int maxEven = 2147483647;
        int maxOdd = 0;
        for (Integer value : map.values()) {
            if(value % 2 == 0){
                if(value < maxEven){
                    maxEven = value;
                }
            }else{
                if(value > maxOdd){
                    maxOdd = value;
                }
            }
        }
        return maxOdd - maxEven;
    }
}