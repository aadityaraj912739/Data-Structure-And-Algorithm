class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String sFirst = strs[0];
        String sEnd = strs[n-1];
        int nf = sFirst.length();
        int ne = sEnd.length();
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while(i < nf && j < ne){
            if(sFirst.charAt(i) != sEnd.charAt(j)){
                break;
            }
            sb.append(sFirst.charAt(i));
            i++;
            j++;
        }
        String result = sb.toString();
        return result;

    }
}