class Solution {
    public boolean isSorted(int[] nums, int i , int j ){
        int k = i+1;
        while(k <= j){
            int pre = nums[i];
            int next = pre+1;
            if(nums[k] <= nums[i]  || next != nums[k]){
                return false;
            }
            i++;
            k++;
        }
        return true;
    }
    public int[] resultsArray(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        int j = 0;
        int[] ans = new int[n-k+1];
        while(j < n){
            if(j - i + 1 > k){
                i++;
            }
             if(j - i + 1 == k){
                if(isSorted(nums,i,j)){
                    ans[i] = nums[j];
                }else{
                    ans[i] = -1;
                }
            }
            j++;
        }
        return ans;
    }
}