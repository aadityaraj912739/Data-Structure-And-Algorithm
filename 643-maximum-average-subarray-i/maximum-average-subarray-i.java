class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        double max = -Double.MAX_VALUE;;
        double sum = 0;
        int i = 0;
        int n = nums.length;
        int j = 0;
        while(j < n){
            sum += nums[j];
            if(j - i + 1 > k){
                sum = sum - nums[i];
                i++;
            }
            if(j - i + 1 == k ){
                double avg = sum/k;
                if(avg > max){
                    max = avg;
                }
            }
            j++;

        }
        return max;
    }
}