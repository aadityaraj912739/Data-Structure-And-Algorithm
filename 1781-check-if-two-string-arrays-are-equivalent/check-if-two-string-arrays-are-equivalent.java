class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        int i = 0;
        int n = word1.length;
        while(i < n){
            sb.append(word1[i]);
            i++;
        }

        int j = 0;
        int m = word2.length;
        while(j < m){
            sb1.append(word2[j]);
            j++;
        }

        String ans = sb.toString();
        String ans1 = sb1.toString();
        if(ans.equals(ans1)){
            return true;
        }else{
            return false;
        }
    }
}