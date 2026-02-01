class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();

        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '#') {
                if (!stack.isEmpty()) {   // ✅ check added
                    stack.pop();
                }
            } else {
                stack.push(s.charAt(i));
            }
            i++;
        }

        int j = 0;
        while (j < t.length()) {
            if (t.charAt(j) == '#') {
                if (!stack1.isEmpty()) {  // ✅ check added
                    stack1.pop();
                }
            } else {
                stack1.push(t.charAt(j));
            }
            j++;
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        while (!stack1.isEmpty()) {
            sb1.append(stack1.pop());
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
