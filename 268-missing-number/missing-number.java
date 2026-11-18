class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n* (n+1))/2;
        int sum = 0;
        int i = 0;
        while(i < n){
            sum = sum + nums[i];
            i++;
        }
        return total -sum;
    }
}