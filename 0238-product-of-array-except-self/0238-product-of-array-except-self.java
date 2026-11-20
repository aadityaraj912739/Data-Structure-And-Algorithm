class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i = 0;
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        while(i < n){
            if(i == 0){
                left[i] = 1;
            }else{
                left[i] = left[i-1]*nums[i-1];
            }
            i++;
        }

        int j = n-1;
        while(j >= 0){
            if(j == n-1){
                right[j] = 1;
            }else{
                right[j] = right[j+1]*nums[j+1];
            }
            j--;
        }
        int k = 0;
        int[] ans = new int[n];
        while(k < n){
            ans[k] = left[k]* right[k];
            k++;
        }
        return ans;
        
    }
}