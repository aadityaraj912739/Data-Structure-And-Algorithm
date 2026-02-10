class Solution {
    public static boolean isVowel(char c){
        if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
            return true;
        }else{
            return false;
        }
    }
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int count = 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j < n){
            if(isVowel(s.charAt(j))){
                if(!map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j),1);
                }else{
                    map.put(s.charAt(j),map.get(s.charAt(j))+1);
                }
                count++;
            }
            if(j - i + 1 > k){
                if(isVowel(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    count--;
                }
                i++;
            }
            if(j - i + 1 == k){
                if(max < count){
                    max = count;
                }
            }
            j++;
        }
        return max;
    }
}