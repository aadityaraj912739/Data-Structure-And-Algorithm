class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        double sum = 0;
        int count = 0;
        double max = Double.NEGATIVE_INFINITY;;
        while(i < n){
            sum = sum + nums[i];
            if(i - j + 1 > k){
                sum = sum - nums[j];
                j++;
            }
            if(i - j + 1 == k){
                count++;
                double ans = sum / k;
                if(max < ans){
                    max = ans;
                }
            }
            
            i++;
        }

        if(count > 0){
            return max;
        }else{
            return 0;
        }
    }
}