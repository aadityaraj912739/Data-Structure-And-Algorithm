class Solution {
    public static String reverse(String str){
        Stack<Character>stack = new Stack();
        int i = 0;
        int n = str.length();
        while(i < n){
            char ch = str.charAt(i);
            stack.push(ch);
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            char ch = stack.pop();
            sb.append(ch);
        }
        return sb.toString();
    }
    public String reverseWords(String s) {
        String[] wordArray = s.split(" ");
        int j = 0;
        int m = wordArray.length;
        while(j < m){
            wordArray[j] = reverse(wordArray[j]);
            j++;
        }
        StringBuilder sb1 = new StringBuilder();
        for(String s1 : wordArray){
            sb1.append(s1).append(" ");
        }
        return sb1.toString().trim();
    }
}