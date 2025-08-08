class Solution {
    public static int digit(char ch) {
        return ch - '0';
    }

    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int n = num.length();
        StringBuilder sb = new StringBuilder();

        while (i < n) {
            char ch = num.charAt(i);
            int val = digit(ch);
            while (!stack.isEmpty() && k > 0 && stack.peek() > val) {
                stack.pop();
                k--;
            }
            stack.push(val);
            i++;
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        if(sb.length() == 0){
            return "0";
        }else{
            return sb.toString();
        }
    }
}
