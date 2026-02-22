class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int n = nums.length;
        int f = 0;
        int size = Integer.MAX_VALUE;
        while(j < n){
            sum = sum + nums[j];
            if(sum > target){
                f++;
                while(sum > target && i < j){
                    sum = sum - nums[i];
                    if(size > j-i+1){
                        size = j-i+1;
                    }
                    i++;
                }
            }
            if(sum >= target){
                f++;
                if(size > j-i+1){
                    size = j-i+1;
                }
            }
            
            j++;
        }
        if(f > 0){
            return size;
        }else return 0;

        
    }
}