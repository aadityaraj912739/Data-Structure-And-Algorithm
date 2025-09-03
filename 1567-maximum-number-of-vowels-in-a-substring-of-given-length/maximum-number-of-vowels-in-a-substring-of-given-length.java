class Solution {
    public boolean isVowel(Character ch){
        if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
            return true;
        }else{
            return false;
        }
        
    }
    public int maxVowels(String s, int k) {
        int i = 0;
        int n = s.length();
        int j = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        while(j < n){
            char ch = s.charAt(j);
            if(j-i+1 > k){
                if(isVowel(s.charAt(i))){
                    count--;
                }
                i++;
            }
            if(j-i+1 <= k){
                if(isVowel(ch)){
                    count++;
                    if(max < count){
                        max = count;
                    }
                }
            }
            
            j++;
        }
        if(max == Integer.MIN_VALUE){
            return 0;
        }else{
            return max;
        }
    }
}