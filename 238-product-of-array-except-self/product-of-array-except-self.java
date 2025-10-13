class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lnums = new int[n];
        int [] rnums = new int[n];
        int i = 1;
        int mul = 1;
        lnums[0] = 1;
        rnums[n-1] = 1;
        int j = n-1;
        while(i < n){
            mul = mul*nums[i-1];
            lnums[i] = mul;
            i++;
        }
        j = n-2;
        int ml = 1;
        while(j >= 0){
            ml = ml*nums[j+1];
            rnums[j] = ml;
            j--;
        }

        int k = 0;
        int[] ans = new int[n];
        while(k < n){
            ans[k] = lnums[k]*rnums[k];
            k++;
        }
        return ans;
    }
}