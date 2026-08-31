class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int i = 0;
        int n = nums.length;
        while(i < n){
            total = total + nums[i];
            i++;
        }

        int leftSum = 0;
        int j = 0;
        while(j < n){
            
            int rightSum = total - leftSum - nums[j];
            if(rightSum == leftSum){
                return j;
            }

            leftSum = leftSum + nums[j];
            j++;
        }
        return -1;
    }
}