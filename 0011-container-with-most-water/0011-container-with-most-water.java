class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int n = height.length;
        int j = n-1;
        int max = 0;
        while(i < j){
            int minVal = Math.min(height[i], height[j]);

            int area = minVal*(j-i);
            if(max < area){
                max = area;
            }
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}