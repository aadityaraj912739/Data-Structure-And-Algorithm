import java.util.Stack;

class Solution {
    public char[] reverse(char[] cht, int start, int end) {
        while (start < end) {
            char temp = cht[start];
            cht[start] = cht[end];
            cht[end] = temp;
            start++;
            end--;
        }
        return cht;
    }

    public String reverseParentheses(String s) {
        char[] cht = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < cht.length; i++) {
            if (cht[i] == '(') {
                stack.push(i); 
            } else if (cht[i] == ')') {
                int start = stack.pop();
                reverse(cht, start + 1, i - 1);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : cht) {
            if (c != '(' && c != ')') {
                result.append(c);
            }
        }
        return result.toString();
    }
}
