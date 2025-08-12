class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>stack = new Stack();
        stack.push(-1);
        int i = 0;
        int n = s.length();
        int max = 0;
        while(i < n){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
            }else{
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(i);
            }
            int cur = i-stack.peek();
            if(max < cur){
                max = cur;
            }
            i++;
        }
        return max;
    }
}