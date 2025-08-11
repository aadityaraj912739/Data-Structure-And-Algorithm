class Solution {
    public static int[] NSE_R(int[] nums) {
    Stack<Integer> stack = new Stack();
    int n = nums.length;
    int i = n - 1;
    int[] ans = new int[n];
    while (i >= 0) {
        int val = nums[i];
        while (!stack.isEmpty() && val <= nums[stack.peek()]) {
            stack.pop(); 
        }
        if (stack.isEmpty()) {
            ans[i] = n; 
        } else {
            ans[i] = stack.peek();
        }
        stack.push(i);
        i--;
    }
    return ans;
}

    public static int[] NSE_L(int[] nums) {
    Stack<Integer> stack = new Stack();
    int n = nums.length;
    int i = 0;
    int[] ans = new int[n];
    while (i < n) {
        int val = nums[i];
        while (!stack.isEmpty() && val <= nums[stack.peek()]) {
            stack.pop(); 
        }
        if (stack.isEmpty()) {
            ans[i] = -1;
        } else {
            ans[i] = stack.peek();
        }
        stack.push(i);
        i++;
    }
    return ans;
}

    public int largestRectangleArea(int[] heights) {
        int[] nsel = NSE_L(heights);
        int[] nser = NSE_R(heights);
        int max = 0;
        int i = 0;
        int n = heights.length;
        while(i < n){
            int width = nser[i]-nsel[i]-1;
            int area = width*heights[i];
            if(area > max){
                max = area;
            }
            i++;
        }
        return max;
    }
}