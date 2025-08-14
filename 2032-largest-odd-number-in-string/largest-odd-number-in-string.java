class Solution {
    public static int numChar(char ch){
        return ch-'0';
    }
    public String largestOddNumber(String num) {
        int i = 0;
        int n = num.length();
        int j = n-1;
        int index = n;
        Stack<Character>stack = new Stack();
        while(j >= 0){
            char ch = num.charAt(j);
            int val = numChar(ch);
            if(val % 2 != 0){
                index = j;
                break;
            }
            j--;
        }
        while(j >= 0){
            stack.push(num.charAt(j));
            j--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        if(index == n){
            return "";
        }else{
            return sb.toString();
        }
    }
}