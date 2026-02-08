class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < n){
            if(!stack.isEmpty() && s.charAt(i) == '*'){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
            i++;
        }
        int m = stack.size();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        sb.reverse();
        String ans = sb.toString();
        return ans;
    }
}