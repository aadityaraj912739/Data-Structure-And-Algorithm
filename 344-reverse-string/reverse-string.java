class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        Stack<Character> stack = new Stack();
        int i = 0;
        while(i < n){
            stack.push(s[i]);
            i++;
        }
        int j = 0;
        while(j < n){
            char ch = stack.pop();
            s[j] = ch;
            j++;
        }
        
    }
}