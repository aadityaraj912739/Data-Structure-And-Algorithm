class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;
        while(i < n){
            if(nums[i] % 2 == 0){
                ans[i] = 0;
            }else{
                ans[i] = 1;
            }
            i++;
        }

        int j = 0;
        while(j < n-1){
            if(ans[j] == ans[j+1]){
                return false;
            }
            j++;
        }
        return true;
    }
}