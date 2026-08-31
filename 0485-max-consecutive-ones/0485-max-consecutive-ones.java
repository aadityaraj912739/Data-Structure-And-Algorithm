class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int max = 0;
        int n = nums.length;
        int i = 0;
        while(i < n){
            if(nums[i] == 0){
                ans = 0;
            }else{
                ans++;
            }

            if(ans > max){
                max = ans;
            }
            i++;
        }
        return max;
    }
}