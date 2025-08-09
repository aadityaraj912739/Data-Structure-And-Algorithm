class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int i = 0;
        int n = temperatures.length;
        int j = n-1;
        Stack<Integer>stack = new Stack();
        int[] ans = new int[n];
        while(j >= 0){
            int val = temperatures[j];
            while(!stack.isEmpty() && val >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[j] = 0;
            }else{
                ans[j] = stack.peek()-j;
            }
            stack.push(j);
            j--;
        }
        return ans;
        
    }
}