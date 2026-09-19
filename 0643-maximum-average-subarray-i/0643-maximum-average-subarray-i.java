class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        double sum = 0;
        double max = -Double.MAX_VALUE;
        while(i < n && j < n){
            sum = sum + nums[j];
            if(j - i + 1 > k){
                sum = sum - nums[i];
                i++;
            }
            if(j - i + 1 == k){
                double avg = sum/k;
                if(max < avg){
                    max = avg;
                }
            }
            j++;
        }
        return max;
    }
}