class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int pro = 1;
        int count = 0;
        while(j < n){
            pro = pro*nums[j];
            if(pro >= k){
                while(i < j && pro >= k){
                    pro = pro/nums[i];
                    i++;
                }
            }
            if(pro < k){
                count = count + (j-i+1);
            }
            j++;
        }
        return count;
    }
}