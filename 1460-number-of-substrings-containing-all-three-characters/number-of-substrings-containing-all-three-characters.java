class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int n = s.length();
        int j = 0;
        int count = 0;
        int sum = 0;
        while(j < n){
            char ch = s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }

            while(i < n && map.size() == 3){
                count++;
                int remain = (n-1)-j;
                count = count+ remain;
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i)) == 0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            sum = sum + count;
            count = 0;
            j++;
        }
        return sum;
    }
}